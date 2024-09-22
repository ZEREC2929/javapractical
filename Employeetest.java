class Employee {
    private String firstName, lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = salary > 0 ? salary : 0.0;
    }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getFirstName() { return firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getLastName() { return lastName; }

    public void setMonthlySalary(double salary) { this.monthlySalary = salary > 0 ? salary : 0.0; }
    public double getMonthlySalary() { return monthlySalary; }

    public double getYearlySalary() { return monthlySalary * 12; }

    public void giveRaise(double percent) { monthlySalary += monthlySalary * percent / 100; }
}

public class Employeetest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Doe", 3000);
        Employee emp2 = new Employee("Jane", "Smith", 4000);

        System.out.println("Emp1 yearly salary: " + emp1.getYearlySalary());
        System.out.println("Emp2 yearly salary: " + emp2.getYearlySalary());

        emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.println("\nAfter 10% raise:");
        System.out.println("Emp1 yearly salary: " + emp1.getYearlySalary());
        System.out.println("Emp2 yearly salary: " + emp2.getYearlySalary());
    }
}
