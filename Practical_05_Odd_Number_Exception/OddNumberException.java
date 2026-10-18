public class OddNumberException {
    static void checkEven(int n) {
        if (n % 2 != 0) throw new IllegalArgumentException("Number is odd");
        System.out.println(n + " is even");
    }
    public static void main(String[] args) {
        try { checkEven(7); }
        catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
    }
}
