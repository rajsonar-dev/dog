<!DOCTYPE html>
<html><body>
<h2>Factorial Calculator</h2>
<form method="post">
  Enter a number (0 to 20): <input type="number" name="num" min="0" max="20" required>
  <button type="submit">Find Factorial</button>
</form>
<%
String input = request.getParameter("num");
if (input != null) {
    try {
        int n = Integer.parseInt(input);
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        out.println("<h3>Factorial = " + fact + "</h3>");
    } catch (NumberFormatException e) {
        out.println("Enter a valid integer.");
    }
}
%>
</body></html>
