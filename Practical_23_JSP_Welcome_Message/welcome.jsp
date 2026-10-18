<!DOCTYPE html>
<html><body>
<form method="post">
  Enter your name: <input type="text" name="username" required>
  <button type="submit">Submit</button>
</form>
<%
String name = request.getParameter("username");
if (name != null && !name.trim().isEmpty()) {
    out.println("<h2>Welcome, " + name + "!</h2>");
}
%>
</body></html>
