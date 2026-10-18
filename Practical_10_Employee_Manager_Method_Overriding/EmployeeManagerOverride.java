class Employee {
    void work() { System.out.println("Employee is working"); }
}
class Manager extends Employee {
    @Override
    void work() { System.out.println("Manager is managing the team"); }
}
public class EmployeeManagerOverride {
    public static void main(String[] args) {
        Employee e = new Employee();
        Employee m = new Manager();
        e.work();
        m.work();
    }
}
