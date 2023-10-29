public class Employee {
    private String name;
    private int salary;

    // constructor
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void displayDetails() {
        System.out.println("Employee's : name = " + name + "salary = " + salary);
    }

    public String toString() {
        return "Employee : name = " + name + "salary = " + salary;
    }

    public double raiseSalary(double raise) {
        return salary = (int) ( (double) salary * (1 + ((raise / 100))));
    }
}