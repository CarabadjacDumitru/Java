package TempConvert;

import javax.servlet.*;
import java.io.IOException;


public class TempConverterServlet extends GenericServlet
{
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String temp = req.getParameter("tempIn");
        String result = validateAndConvert(temp);
        dispatchResultToClient(req,res,result);
    }

    private String validateAndConvert(String temp){
        String result = "bad input";
        try {
            float t = Float.parseFloat(temp);
            float f = c2f(t);
            float c = f2c(t);
            result = temp + " == " + String.valueOf(c) + "F : " + String.valueOf(f) + "C";
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

    private void dispatchResultToClient(ServletRequest req, ServletResponse res, String result){
        try{
            RequestDispatcher rd = req.getRequestDispatcher("convert.jsp");
            req.setAttribute("result",result);
            rd.forward(req,res);
        }catch (ServletException e){}
        catch (IOException e){}
    }


}
