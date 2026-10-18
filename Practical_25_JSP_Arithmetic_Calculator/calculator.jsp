<!DOCTYPE html>
<html><body>
<h2>Arithmetic Operations</h2>
<form method="post">
  First number: <input type="number" step="any" name="a" required><br><br>
  Second number: <input type="number" step="any" name="b" required><br><br>
  <button type="submit">Calculate</button>
</form>
<%
String sa = request.getParameter("a");
String sb = request.getParameter("b");
if (sa != null && sb != null) {
    try {
        double a = Double.parseDouble(sa), b = Double.parseDouble(sb);
        out.println("Sum: " + (a + b) + "<br>");
        out.println("Difference: " + (a - b) + "<br>");
        out.println("Product: " + (a * b) + "<br>");
        out.println("Quotient: " + (b == 0 ? "Cannot divide by zero" : a / b));
    } catch (NumberFormatException e) {
        out.println("Enter valid numbers.");
    }
}
%>
</body></html>
