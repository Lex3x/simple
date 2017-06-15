package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebFault;
import java.io.IOException;
import java.io.PrintWriter;
import Cars.*;

/**
 * Created by PK on 14.05.2017.
 */
@WebServlet("/s")
public class MyServlet  extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println(Carlist.getCarList()+"\n");
    }
}
