class Numbers {
    int a, b, c;
    void setNumbers(int x, int y, int z) { a = x; b = y; c = z; }
}
class Calculate extends Numbers {
    void display() {
        int sum = a + b + c;
        double mean = sum / 3.0;
        System.out.println("Sum = " + sum);
        System.out.println("Mean = " + mean);
    }
}
public class SingleInheritanceSumMean {
    public static void main(String[] args) {
        Calculate obj = new Calculate();
        obj.setNumbers(10, 20, 30);
        obj.display();
    }
}
