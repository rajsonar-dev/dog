import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/table")
public class MultiplicationTableServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        java.io.PrintWriter out = response.getWriter();
        try {
            int n = Integer.parseInt(request.getParameter("num"));
            out.println("<h2>Table of " + n + "</h2>");
            for (int i = 1; i <= 10; i++) {
                out.println(n + " x " + i + " = " + (n * i) + "<br>");
            }
        } catch (NumberFormatException e) {
            out.println("Enter a valid number.");
        }
    }
}
