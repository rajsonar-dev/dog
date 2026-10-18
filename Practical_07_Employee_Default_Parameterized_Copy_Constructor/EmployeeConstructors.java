class Employee {
    int id;
    String name;
    double salary;

    Employee() { id = 0; name = "Unknown"; salary = 0; }
    Employee(int i, String n, double s) { id = i; name = n; salary = s; }
    Employee(Employee e) { id = e.id; name = e.name; salary = e.salary; }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}
public class EmployeeConstructors {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Amit", 25000);
        Employee e3 = new Employee(e2);
        e1.display(); e2.display(); e3.display();
    }
}
