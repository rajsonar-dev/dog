class Employee {
    int id; String name; double salary;
    Employee() { id = 0; name = "Not given"; salary = 0; }
    Employee(int id, String name, double salary) {
        this.id = id; this.name = name; this.salary = salary;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Ravi", 30000);
        e1.display();
        System.out.println("--- Parameterized employee ---");
        e2.display();
    }
}
