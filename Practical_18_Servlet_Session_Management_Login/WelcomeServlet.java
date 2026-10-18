import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        response.setContentType("text/html");
        if (session != null && session.getAttribute("username") != null) {
            response.getWriter().println("<h2>Welcome, " +
                session.getAttribute("username") + "!</h2>");
        } else {
            response.getWriter().println("Please login first.");
        }
    }
}
