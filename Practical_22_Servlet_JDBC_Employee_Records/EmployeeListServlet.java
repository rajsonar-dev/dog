import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/employees")
public class EmployeeListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Employee Records</h2><table border='1'><tr><th>ID</th><th>Name</th><th>Salary</th></tr>");
        String url = "jdbc:mysql://localhost:3306/college";
        try (Connection con = DriverManager.getConnection(url, "root", "YOUR_PASSWORD");
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT id, name, salary FROM employee")) {
            while (rs.next()) {
                out.println("<tr><td>" + rs.getInt("id") + "</td><td>" +
                    rs.getString("name") + "</td><td>" + rs.getDouble("salary") + "</td></tr>");
            }
        } catch (SQLException e) {
            out.println("<tr><td colspan='3'>Database error: " + e.getMessage() + "</td></tr>");
        }
        out.println("</table>");
    }
}
