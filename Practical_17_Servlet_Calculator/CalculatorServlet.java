import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            double a = Double.parseDouble(request.getParameter("num1"));
            double b = Double.parseDouble(request.getParameter("num2"));
            String op = request.getParameter("operator");
            double result;
            switch (op) {
                case "+": result = a + b; break;
                case "-": result = a - b; break;
                case "*": result = a * b; break;
                case "/":
                    if (b == 0) { out.println("Cannot divide by zero"); return; }
                    result = a / b; break;
                default: out.println("Invalid operator"); return;
            }
            out.println("<h2>Result: " + result + "</h2>");
        } catch (NumberFormatException e) {
            out.println("Please enter valid numbers");
        }
    }
}
