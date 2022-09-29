package rikkei.academy.productdiscountcalculato;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Product-Discount-Calculator-servlet", value = "/ProductDiscountCalculator")
public class HelloServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    public void destroy() {
    }
}