import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JdbcJTableDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "YOUR_PASSWORD";

        JFrame frame = new JFrame("Employee Records");
        DefaultTableModel model = new DefaultTableModel(
            new String[]{"ID", "Name", "Salary"}, 0);
        JTable table = new JTable(model);

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT id, name, salary FROM employee")) {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt("id"), rs.getString("name"),
                    rs.getDouble("salary")});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frame, "Database error: " + e.getMessage());
        }
        frame.add(new JScrollPane(table));
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
