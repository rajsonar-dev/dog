class OddNumberException extends Exception {
    OddNumberException(String message) { super(message); }
}
public class UserDefinedOddException {
    static void check(int n) throws OddNumberException {
        if (n % 2 != 0) throw new OddNumberException("Odd number is not allowed");
        System.out.println(n + " is even");
    }
    public static void main(String[] args) {
        try { check(5); }
        catch (OddNumberException e) { System.out.println(e.getMessage()); }
    }
}
