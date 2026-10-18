import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("cookieName");
        String value = request.getParameter("cookieValue");
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(60 * 60);
        response.addCookie(cookie);
        response.setContentType("text/html");
        response.getWriter().println("Cookie created. Value: " + value);
    }
}
