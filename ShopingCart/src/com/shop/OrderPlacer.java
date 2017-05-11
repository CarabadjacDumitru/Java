package com.shop;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class OrderPlacer extends HttpServlet {
    private BigDecimal total = BigDecimal.ZERO;

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) {
        try {
            total = BigDecimal.ZERO;
            List<LineItem> lineItems = getConfirmationInputs(req, res);
            saveToDB(lineItems);
            sendResponse(req, res, lineItems, this.total);
        } catch (Exception e) {
        }
    }

    private List<LineItem> getConfirmationInputs(HttpServletRequest req, HttpServletResponse res) {
        List<LineItem> lineItems = new ArrayList<LineItem>();
        int ind = 1;
        int rowCount = -1;
        try {
            rowCount = Integer.parseInt(req.getParameter("rowCount").trim());
            for (int i = 0; i < rowCount; i++) {
                int qty = Integer.parseInt(req.getParameter("num-" + ind).trim());
                int id = Integer.parseInt(req.getParameter("id-" + ind).trim());
                String product = req.getParameter("prod-" + ind);
                String category = req.getParameter("cat-" + ind);
                BigDecimal price = new BigDecimal(req.getParameter("price-" + ind).trim());
                lineItems.add(new LineItem(qty, id, product, category, price));
                if (qty > 0) {
                    BigDecimal subtotal = price.multiply(new BigDecimal(qty));
                    this.total = this.total.add(subtotal);
                }
                ind++;
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException("wow");
        }
        return lineItems;
    }

    private void saveToDB(List<LineItem> lineItems) {

	/* The 'saveToDB' part is going to be an exercise:
       what follows is the confirmation email.
	*/
        String msg = "Order summary:\n";
        for (LineItem item : lineItems)
            msg += item.toString();
        msg += "Total: $" + this.total + "\n";
        sendConfirmingEmail("customer@somewhere.org", msg);
    }

    private void sendConfirmingEmail(String to, String confirmMsg) {
        /*
        * removed
        * */
    }

    private void sendResponse(HttpServletRequest req,
                              HttpServletResponse res,
                              List<LineItem> items,
                              BigDecimal totalPrice) {
        try {
            HttpSession session = req.getSession();
            session.setAttribute("items", items);
            session.setAttribute("total", totalPrice);
            res.sendRedirect("placeOrder.jsp");
        } catch (IOException e) {
        }
    }
}
