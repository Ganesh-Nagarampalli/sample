class A 
{
    void show()
    {
        System.out.println("parent class invoked");
    }
    int add(int a, int b)
    {
        return a+b;
    }
}
class B extends A
{
    int add(int a, int b)
    {
        System.out.println("child class invoked");
        return a+2*b;
    }
}
class Test
{
    public static void main(String arg[])
    {
        B r1 = new B();
        r1.show();
        r1.add(5,6);
    }
}