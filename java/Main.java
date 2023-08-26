import java.util.Scanner;
import java.util.Vector;

class Main {
  public static void main(String[] args) {
    Vector<Object> values = new Vector<>();
    Scanner scanner = new Scanner(System.in);

    // Accept and store values of different data types
    System.out.print("Enter a string: ");
    String str = scanner.nextLine();
    values.add(str);

    System.out.print("Enter an integer: ");
    int num = scanner.nextInt();
    values.add(num);

    System.out.print("Enter a double: ");
    double dbl = scanner.nextDouble();
    values.add(dbl);

    System.out.print("Enter a boolean: ");
    boolean bool = scanner.nextBoolean();
    values.add(bool);

    // Convert values to corresponding wrapper classes
    String strWrapped = (String) values.get(0);
    Integer numWrapped = (Integer) values.get(1);
    Double dblWrapped = (Double) values.get(2);
    Boolean boolWrapped = (Boolean) values.get(3);

    // Display values using the vector
    System.out.println("Vector: " + values);
    System.out.println("Wrapped values: " + strWrapped + ", " + numWrapped + ", " + dblWrapped + ", " + boolWrapped);
  }
}
