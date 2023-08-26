import java.util.*;
class Vehicle
{
    String type;
    Vehicle(String type)
    {
      this.type = type;
    }
}
class Brand extends Vehicle
{
    String brand;
    Brand(String type, String brand)
    {
      super(type);
      this.brand = brand;
    }
} 
class Cost extends Brand
{
    int cost;
    Cost(String type, String brand, int cost)
    {
      super(type, brand);
      this.cost = cost;
    }
    void VehicleInformation()
    {
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Cost: $" + cost);
    }
}
class Week_5_1
{
    static String type, brand;
    static int cost;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter type of vehicle");
        type = sc.next();
        System.out.println("Enter brand name of vehicle");
        brand = sc.next();
        System.out.println("Enter cost of vehicle");
        cost = sc.nextInt();
        Cost c = new Cost(type, brand, cost);
        c.VehicleInformation();  
    }
}
  