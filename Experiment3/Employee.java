public class Employee extends Person {
    String department;
    String employee_id;
    int salary;

    void display() {
        super.display();
        System.out.println("Department: " + this.department);
        System.out.println("Employee ID: " + this.employee_id);
        System.out.println("Salary: " + this.salary);
    }
}
