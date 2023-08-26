import java.util.HashMap;
import java.util.Scanner;
class Employee2
{
    int id;
    String name;
    double salary;
    void setId(int id)
    {
        this.id = id;
    }
    int getId()
    {
        return id;
    }
    void setName(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return name;
    }
    void setSalary(double salary)
    {
        this.salary = salary;
    }
    double getSalary()
    {
        return salary;
    }
}
public class seven_c
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        HashMap <Integer, Employee2> emp = new HashMap<>();
        System.out.print("Enter the number of employees: ");
        int num = sc. nextInt();
        Employee2 e[] = new Employee2[num];
        for(int i=0; i<num; i++)
        {
            e[i] = new Employee2();
            System.out.println("enter employee id");
            e[i].setId(sc.nextInt());
            System.out.println("enter employee name");
            e[i].setName(sc.next());
            System.out.println("enter employee salary");
            e[i].setSalary(sc.nextDouble());
            emp.put(e[i].id, e[i]);
        }
        System.out.println("enter id of the employee to search");
        int key = sc.nextInt();
        if(emp.containsKey(key))
        {
            System.out.println("employee id : "+ emp.get(key).id);
            System.out.println("employee name : "+ emp.get(key).name);
            System.out.println("employee salary : "+ emp.get(key).salary);
        }
        else
        {
            System.out.println("Key not found.");
        }
    }   
}
