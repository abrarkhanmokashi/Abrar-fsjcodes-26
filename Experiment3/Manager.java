public class Manager extends Employee {
    int num_of_proj;
    int num_of_teams;

    void display() {
        super.display();
        System.out.println("Number of Projects: " + this.num_of_proj);
        System.out.println("Number of Teams: " + this.num_of_teams);
    }
}
