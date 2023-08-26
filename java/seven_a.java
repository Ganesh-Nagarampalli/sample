import java.util.ArrayList;
import java.util.Scanner;
public class seven_a
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int choice, num, index;
        while(true)
        {
            System.out.println("Enter\n1 to add\n2 to remove\n3 to display\n4 to exit");
            choice = sc.nextInt();
            if (choice==4)
            {
                break;
            }
            switch(choice)
            {
                case 1:
                    System.out.print("enter an integer : ");
                    num = sc.nextInt();
                    a.add(num);
                    break;
                case 2:
                    System.out.print("enter index of the element to remove : ");
                    index = sc.nextInt();
                    a.remove(index);
                    break;
                case 3:
                    System.out.print("elements in the array are : ");
                    for(int i=0; i<a.size(); i++)
                    {
                        System.out.print(a.get(i)+" ");
                    }
                    System.out.print("\n");
                    break;
                default:
                    System.out.println("enter correct choice");
                    break;
            }
        }
    }
}
