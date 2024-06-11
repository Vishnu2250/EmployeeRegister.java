import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Employee {
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private String address;

    public Employee(String firstName, String lastName, String mobileNumber, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-15s %-30s %-15s", firstName, lastName, mobileNumber, email, address);
    }
}

public class EmployeeRegister {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number of Employees: ");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter Employee " + (i + 1) + " Details:");
            System.out.print("Enter the Firstname: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter the Lastname: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter the Mobile: ");
            String mobileNumber = scanner.nextLine();
            System.out.print("Enter the Email: ");
            String email = scanner.nextLine();
            System.out.print("Enter the Address: ");
            String address = scanner.nextLine();

            Employee employee = new Employee(firstName, lastName, mobileNumber, email, address);
            employees.add(employee);
        }

        // Sort employees by first name
        Collections.sort(employees, Comparator.comparing(Employee::getFirstName));

        // Print employee list
        System.out.println("\nEmployee List:");
        System.out.printf("%-15s %-15s %-15s %-30s %-15s\n", "FirstName", "LastName", "MobileNumber", "Email", "Address");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
