public class BuiltInExceptionsDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: cannot divide by zero");
        }

        try {
            int n = Integer.parseInt("abc");
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: invalid number format");
        }
    }
}
