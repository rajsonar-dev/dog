import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/language")
public class LanguageServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String saved = null;
        if (cookies != null) {
            for (Cookie c : cookies) {
                if ("language".equals(c.getName())) saved = c.getValue();
            }
        }
        response.setContentType("text/html");
        response.getWriter().println("<h2>Saved language: " +
            (saved == null ? "No preference saved" : saved) + "</h2>" +
            "<form method='post' action='language'>" +
            "<select name='language'><option>English</option><option>Hindi</option><option>Marathi</option></select>" +
            "<button type='submit'>Save preference</button></form>");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie c = new Cookie("language", request.getParameter("language"));
        c.setMaxAge(60 * 60 * 24 * 30);
        response.addCookie(c);
        response.sendRedirect("language");
    }
}
