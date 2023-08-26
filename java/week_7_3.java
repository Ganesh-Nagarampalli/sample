import java.util.*;
import java.lang.*;
class Employee
{
    int id;
    String name;
    int salary;
    int getId()
    {
        return id;
    }
    void setId(int i)
    {
        id = i;
    }
    String getName()
    {
        return name;
    }
    void setName(String n)
    {
        name = n;
    }
    int getSalary()
    {
        return salary;
    }
    void setSalary(int s)
    {
        salary = s;
    }
}
class week_7_3 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int num = sc. nextInt();
        Employee e[] = new Employee[num];
        HashMap <Integer, Employee> map = new HashMap<Integer, Employee>();
        for(int i = 0; i < num; i++)
        {
            e[i] = new Employee();
            System.out.println("For Employee "+(i+1));
            System.out.print("Enter the id: ");
            e[i].setId(sc.nextInt());
            System.out.print("Enter the name: ");
            e[i].setName(sc.next());
            System.out.print("Enter the salary: ");
            e[i].setSalary(sc.nextInt());
            map.put(e[i].id,e[i]);
        }

        int id;
        System.out.print("Enter the key to be searched: ");
        id = sc.nextInt();
        if(map.containsKey(id))
        {
            System.out.println("id: "+(map.get(id).id));
            System.out.println("name: "+(map.get(id).name));
            System.out.println("salary: "+(map.get(id).salary));
        }
        else
        {
            System.out.println("Key not found");
        }
    }
}  
      
