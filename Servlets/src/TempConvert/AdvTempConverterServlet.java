package TempConvert;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class AdvTempConverterServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        this.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String temp = req.getParameter("tempIn");
        String result = validateAndConvert(temp);
        redirectResultToClient(req,resp,result);
    }



    private void redirectResultToClient(HttpServletRequest req, HttpServletResponse res,String result){
        try {
            HttpSession session = req.getSession();
            session.setAttribute("result",result);
            res.sendRedirect("Converter/convert.jsp");
        }catch (IOException e){}
    }

    private String validateAndConvert(String temp){
        String result = "bad input";
        float tt ,ff,cc;
        try {
            tt = Float.parseFloat(temp);
            ff = c2f(tt);
            cc = f2c(tt);
            result = temp + " == " + String.valueOf(cc) + "F : " + String.valueOf(ff) + "C";
        }
        catch (NumberFormatException e){}
        return result;
    }

    private float c2f (float xx ){
        return (5.0f/9.0f)*(xx -32.0f);
    }

    private float f2c (float yy ) {
        return (9f / 5f) * yy  + 32f;
    }
}
