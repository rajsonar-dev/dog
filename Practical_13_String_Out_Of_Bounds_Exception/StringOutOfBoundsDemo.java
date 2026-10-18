public class StringOutOfBoundsDemo {
    public static void main(String[] args) {
        String text = "Hello";
        try {
            System.out.println(text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: string index is out of range");
        }
    }
}
