import java.util.*;
class Employee {
    int id;
    String name;
    int age;
    String department;
  
    // Constructor
    public Employee(int id, String name, int age, String department) {
      this.id = id;
      this.name = name;
      this.age = age;
      this.department = department;
    }
  
    // Setters
    public void setId(int id) {
      this.id = id;
    }
    public void setName(String name) {
      this.name = name;
    }
    public void setAge(int age) {
      this.age = age;
    }
    public void setDepartment(String department) {
      this.department = department;
    }
  
    // Getters
    public int getId() {
      return this.id;
    }
    public String getName() {
      return this.name;
    }
    public int getAge() {
      return this.age;
    }
    public String getDepartment() {
      return this.department;
    }
  }
class week_73
{
    public static void main(String arg[])
    {
        HashMap<Integer, Employee> employeeMap = new HashMap<>();

        // Add some employees to the map
        employeeMap.put(1, new Employee(1, "John Smith", 30, "Engineering"));
        employeeMap.put(2, new Employee(2, "Jane Doe", 35, "HR"));
        employeeMap.put(3, new Employee(3, "Bob Johnson", 40, "Marketing"));

        // Perform a search by ID
        int searchId = 2;
        Employee employee = employeeMap.get(searchId);
        if (employee != null) {
        System.out.println("Employee found: " + employee.getName());
        } else {
        System.out.println("Employee not found.");
        }

    }
}
  