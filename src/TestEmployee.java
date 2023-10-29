public class TestEmployee {

    public static void main(String[] args) {
        Employee emp1 = new Employee("CHAN Tai Man", 12000);
        Employee emp2 = new Employee("TAM Ping Shing", 13500);
        System.out.println("Before-");
        emp1.displayDetails();
        emp2.displayDetails();
        System.out.println("After-");
        emp1.raiseSalary(5);
        emp2.raiseSalary(10);
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
