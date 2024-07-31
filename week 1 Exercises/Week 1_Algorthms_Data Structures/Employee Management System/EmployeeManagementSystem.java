
public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee employee) {
        if (size < employees.length) {
            employees[size++] = employee;
        } else {
            System.out.println("Array is full. Cannot add more employees.");
        }
    }

    public Employee searchEmployeeById(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployeeById(int employeeId) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee not found.");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[size - 1] = null;
        size--;
    }

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(10);

        system.addEmployee(new Employee(1, "Hemanth", "Manager", 70000));
        system.addEmployee(new Employee(2, "Kiran", "Developer", 60000));
        system.addEmployee(new Employee(3, "Naveen", "Analyst", 50000));

        System.out.println("All employees:");
        system.traverseEmployees();

        Employee foundEmployee = system.searchEmployeeById(2);
        if (foundEmployee != null) {
            System.out.println("\nEmployee found: " + foundEmployee);
        } else {
            System.out.println("\nEmployee not found.");
        }

        system.deleteEmployeeById(2);

        System.out.println("\nEmployees after deletion:");
        system.traverseEmployees();
    }
}
