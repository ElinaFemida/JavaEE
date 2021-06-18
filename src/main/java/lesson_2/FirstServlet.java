package lesson_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "lesson_2.FirstServlet", urlPatterns = "/lesson_2.FirstServlet")
public class FirstServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Log: GET");
        PrintWriter out = resp.getWriter();
        resp.setHeader("Content-Type", "text/html; charset=utf-8");
        out.printf("<h1>Products</h1>");
        Product p1 = new Product(1, "lesson_2.Product 1", 100);
        Product p2 = new Product(2, "lesson_2.Product 2", 100);
        Product p3 = new Product(3, "lesson_2.Product 3", 200);
        Product p4 = new Product(4, "lesson_2.Product 4", 600);
        Product p5 = new Product(5, "lesson_2.Product 5", 200);
        Product p6 = new Product(6, "lesson_2.Product 6", 2000);
        Product p7 = new Product(7, "lesson_2.Product 7", 253);
        Product p8 = new Product(8, "lesson_2.Product 8", 200);
        Product p9 = new Product(9, "lesson_2.Product 9", 644);
        Product p10 = new Product(10, "lesson_2.Product 10", 333);
        List<Product> products = new ArrayList<>(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10));
        products.forEach(p-> {
            out.println("<p>" + p.toString() + "<p>");
        });
        out.close();
    }

}
