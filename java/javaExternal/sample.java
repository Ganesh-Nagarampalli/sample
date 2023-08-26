// import java.util.*;
// public class sample {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int num =sc.nextInt();
//         try{
//         if(num==1)
//         {
//             throw new ArithmeticException("hi");
//         }
//     }
//     catch(ArithmeticException e)
//     {
//         System.out.println(e);
//     }
//     }
// }
class Example {
    int a, b;

    // default constructor
    Example() {
        a = 0;
        b = 0;
        System.out.println("Default Constructor called.");
    }

    // parameterized constructor
    Example(int x, int y) {
        a = x;
        b = y;
        System.out.println("Parameterized Constructor called.");
    }

    public static void main(String args[]) {
        Example obj = new Example();
    }
}

