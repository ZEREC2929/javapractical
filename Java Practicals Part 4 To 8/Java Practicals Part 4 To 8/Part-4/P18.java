import java.util.Scanner;

class Member
{
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary()
    {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member
{
    String specialization;
    void displayEmployeeDetails()
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Specialization: " + specialization);
        printSalary(); 
    }
}
class Manager extends Member
{
        String department;
        void displayManagerDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        printSalary();
    }
}
public class P18
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("Enter Employee Details:");
        
        System.out.print("Name: ");
        employee.name = scanner.nextLine();
        
        System.out.print("Age: ");
        employee.age = scanner.nextInt();
        
        scanner.nextLine(); 
        System.out.print("Phone Number: ");
        
        employee.phoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        
        employee.address = scanner.nextLine();
        System.out.print("Salary: ");
        
        employee.salary = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Specialization: ");
        employee.specialization = scanner.nextLine();

        System.out.println("\nEmployee Details:");
        employee.displayEmployeeDetails();

        System.out.println(); 
        Manager manager = new Manager();
        
        System.out.println("Enter Manager Details:");
        System.out.print("Name: ");
        
        manager.name = scanner.nextLine();
        System.out.print("Age: ");
        manager.age = scanner.nextInt();
        
        scanner.nextLine(); 
        System.out.print("Phone Number: ");
        
        manager.phoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        
        manager.address = scanner.nextLine();
        System.out.print("Salary: ");
        
        manager.salary = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Department: ");
        manager.department = scanner.nextLine();

        System.out.println("\nManager Details:");
        manager.displayManagerDetails();

        scanner.close();
    }
}