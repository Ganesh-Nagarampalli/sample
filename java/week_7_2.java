/*Write a program to implement a new ArrayList class. It should contain add(), get(),
remove(), size() methods. Use dynamic array logic.*/

import java.util.*;
class week_7_2
{
    public static void main(String arg[])
    {
        int size, num;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        System.out.println("enter size of array");
        size = sc.nextInt();
        System.out.println("enter elements");
        for(int i=0; i<size; i++)
        {
            num = sc.nextInt();
            ar.add(num);
        }
        System.out.println("size of the array = "+ar.size());
        System.out.println("Elements in array"+ ar);
        // for(int i=0; i<ar.size(); i++)
        // {
        //     System.out.print(+ar.get(i)+" ");
        // }
        System.out.print("\n");
        ar.remove(3);
        System.out.println("After removing element at index 3");
        for(int i=0; i<ar.size(); i++)
        {
            System.out.print(+ar.get(i)+" ");
        }    
    }
}
