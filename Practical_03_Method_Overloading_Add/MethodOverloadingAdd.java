public class MethodOverloadingAdd {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    double add(int a, double b) { return a + b; }

    public static void main(String[] args) {
        MethodOverloadingAdd obj = new MethodOverloadingAdd();
        System.out.println("2 + 3 = " + obj.add(2, 3));
        System.out.println("2.1 + 2.4 = " + obj.add(2.1, 2.4));
        System.out.println("3 + 4.5 = " + obj.add(3, 4.5));
    }
}
