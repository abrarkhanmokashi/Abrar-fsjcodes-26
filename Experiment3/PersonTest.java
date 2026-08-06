public class PersonTest {

    public static void main(String[] args) {

        Manager m1 = new Manager();

        m1.name = "Abrar";
        m1.age = 20;
        m1.gender = "Male";

        m1.department = "Backend handling";
        m1.employee_id = "234-ASX456";
        m1.num_of_proj = 3;
        m1.num_of_teams = 5;
        m1.salary = 5000000;

        m1.display();
    }
}
