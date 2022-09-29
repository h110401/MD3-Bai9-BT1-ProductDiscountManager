package rikkei.academy.productdiscountcalculato;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalServlet", value = "/CalServlet")
public class CalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dis = request.getParameter("ProductDescription" );

        float oldPrice = Float.parseFloat(request.getParameter("ListPrice"));
        float calPrice = Float.parseFloat(request.getParameter(" DiscountPercent"));

        float DiscountAmount = (float) (oldPrice * calPrice * 0.01);
       float DiscountPrice = oldPrice - DiscountAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println(" <meta charset=\"UTF-8\">");
        writer.println("<h1>Product Description : " + dis + "</h1>");

        writer.println("<h1>List Price: " + oldPrice + "</h1>");
        writer.println("<h1>Discount Amount : " + DiscountAmount + "</h1>");
        writer.println("<h1>Discount Price : " + DiscountPrice + "</h1>");


        writer.println("</html>");




    }
}
