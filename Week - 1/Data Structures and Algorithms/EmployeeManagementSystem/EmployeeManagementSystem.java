package EmployeeManagementSystem;

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size;
    private int capacity;

    public EmployeeManagementSystem(int capacity) {
        this.capacity = capacity;
        this.employees = new Employee[capacity];
        this.size = 0;
    }

    // Add a new employee
    public boolean addEmployee(Employee employee) {
        if (size >= capacity) {
            System.out.println("Array is full. Cannot add more employees.");
            return false;
        }
        employees[size++] = employee;
        return true;
    }

    // Search for an employee by employeeId
    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse and print all employees
    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete an employee by employeeId
    public boolean deleteEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                employees[i] = employees[size - 1]; // Replace with last employee
                employees[size - 1] = null; // Remove last employee
                size--;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(10);

        Employee emp1 = new Employee(1, "Alice", "Manager", 75000);
        Employee emp2 = new Employee(2, "Bob", "Developer", 60000);
        Employee emp3 = new Employee(3, "Charlie", "Analyst", 50000);

        system.addEmployee(emp1);
        system.addEmployee(emp2);
        system.addEmployee(emp3);

        System.out.println("All employees:");
        system.traverseEmployees();

        System.out.println("Search for employee with ID 2:");
        System.out.println(system.searchEmployee(2));

        System.out.println("Deleting employee with ID 2");
        system.deleteEmployee(2);

        System.out.println("All employees after deletion:");
        system.traverseEmployees();
    }
}

// Output:
// All employees:
// Employee{employeeId=1, name='Alice', position='Manager', salary=75000.0}
// Employee{employeeId=2, name='Bob', position='Developer', salary=60000.0}
// Employee{employeeId=3, name='Charlie', position='Analyst', salary=50000.0}
// Search for employee with ID 2:
// Employee{employeeId=2, name='Bob', position='Developer', salary=60000.0}
// Deleting employee with ID 2
// All employees after deletion:
// Employee{employeeId=1, name='Alice', position='Manager', salary=75000.0}
// Employee{employeeId=3, name='Charlie', position='Analyst', salary=50000.0}
