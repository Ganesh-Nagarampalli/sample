import java.util.*;
abstract class Employee
{
    String name;
    double gross_salary;
    double allowance;
    double tax;
    double insurance;
    double pf;
    Employee(String n, double t, double a, double i)
    {
        name = n;
        gross_salary = t;
        allowance = a;
        insurance = i;
    }
    abstract double netTakeSalary();
    abstract void displayInfo();
}

class Manager extends Employee
{
    Manager(String n, double t, double a, double i)
    {
        super(n, t, a, i);
    }
    double netTakeSalary()
    {
        double s = gross_salary*12;
        pf = s*0.1;
        tax = 0;
        int arrays[] = {250000, 500000, 750000, 1000000, 1250000, 1500000};
        double arrayt[] = {0.05, 0.1, 0.15, 0.2, 0.25, 0.3};
        int i = 5;
        while(i>-1)
        {
            if(s>arrays[i])
            {
                double dif = s - arrays[i];
                tax = tax + dif*arrayt[i];
                s = s - dif;
            }
            i--;
        }
        tax = tax + 0.04*tax;
        double x = gross_salary*12 - insurance*12 - tax - pf + allowance*12;
        return x/12;
    }

    void displayInfo()
    {
        System.out.println("Employee name: "+ name);
        System.out.println("Post: Manager");
        System.out.println("Gross Salary: "+ gross_salary);
        System.out.println("Net Salary: "+ netTakeSalary());
    }
}

class Clerk extends Employee
{
    Clerk(String n, double t, double a, double i)
    {
        super(n, t, a, i);
    }
    double netTakeSalary()
    {
        double s = gross_salary*12;
        pf = s*0.1;
        tax = 0;
        int arrays[] = {250000, 500000, 750000, 1000000, 1250000, 1500000};
        double arrayt[] = {0.05, 0.1, 0.15, 0.2, 0.25, 0.3};
        int i = 5;
        while(i>-1)
        {
            if(s>arrays[i])
            {
                double dif = s - arrays[i];
                tax = tax + dif*arrayt[i];
                s = s - dif;
            }
            i--;
        }
        tax = tax + 0.04*tax;
        double x = gross_salary*12 - insurance*12 - tax - pf + allowance*12;
        return x/12;
    }

    void displayInfo()
    {
        System.out.println("Employee name: "+ name);
        System.out.println("Post: Clerk");
        System.out.println("Gross Salary: "+ gross_salary);
        System.out.println("Net Salary: "+ netTakeSalary());
    }
}

class Employeetest
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String name;
        double allowance;
        double insurance;
        double g_salary;
        while(true)
        {
            System.out.print("Enter the post of your employee: ");
            String post = sc.next();
            System.out.print("Enter the name: ");
            name = sc.next();
            System.out.print("Enter the gross salary per month: ");
            g_salary = sc.nextInt();
            System.out.print("Enter the allowance per month: ");
            allowance = sc.nextDouble();
            System.out.print("Enter the insurance amount per month: ");
            insurance = sc.nextDouble();
            if(post.equalsIgnoreCase("manager"))
            {
                Manager m = new Manager(name, g_salary, allowance, insurance);
                m.displayInfo();
            }
            if(post.equalsIgnoreCase("clerk"))
            {
                Clerk c = new Clerk(name, g_salary, allowance, insurance);
                c.displayInfo();
            }
            int c;
            System.out.println("(1:Yes, 2:No)\nDo you want to continue?");
            c = sc.nextInt();
            if(c==2)
            {
                break;
            }

        }
    }
}