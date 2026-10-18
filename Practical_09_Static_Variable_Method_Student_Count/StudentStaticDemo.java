class Student {
    static int count = 0;
    String name;
    Student(String name) { this.name = name; count++; }
    static void showCount() { System.out.println("Objects created: " + count); }
}
public class StudentStaticDemo {
    public static void main(String[] args) {
        new Student("Amit");
        new Student("Neha");
        new Student("Raj");
        Student.showCount();
    }
}
