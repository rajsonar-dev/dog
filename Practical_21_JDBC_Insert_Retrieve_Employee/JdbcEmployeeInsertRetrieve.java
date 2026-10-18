import java.sql.*;
import java.util.Scanner;

public class JdbcEmployeeInsertRetrieve {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "YOUR_PASSWORD";

        try (Connection con = DriverManager.getConnection(url, user, password);
             Scanner sc = new Scanner(System.in)) {
            String insert = "INSERT INTO employee(id, name, salary) VALUES(?, ?, ?)";
            System.out.print("Enter ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print("Enter name: "); String name = sc.nextLine();
            System.out.print("Enter salary: "); double salary = sc.nextDouble();

            try (PreparedStatement ps = con.prepareStatement(insert)) {
                ps.setInt(1, id); ps.setString(2, name); ps.setDouble(3, salary);
                ps.executeUpdate();
            }
            System.out.println("Employee inserted.");

            try (Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery("SELECT * FROM employee")) {
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " " + rs.getString("name")
                        + " " + rs.getDouble("salary"));
                }
            }
        }
    }
}
