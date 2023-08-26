// explain throw throws and finally with the below program 

class InvalidAgeException extends Exception 
{
  public InvalidAgeException(String message) 
  {
      super(message);
  }
}

class Person
{
  int age;

  public Person(int age) throws InvalidAgeException 
  {
      if (age < 0) 
      {
        throw new InvalidAgeException("Age cannot be negative");
      }
      this.age = age;
  }

  public int getAge() 
  {
    return age;
  }
}

class UserDefinedExceptionExample
{
  public static void main(String[] args) 
  {
    try 
    {
        Person person = new Person(-5);
    }
    catch (InvalidAgeException e) 
    {
      System.out.println("Error: " + e.getMessage());
    }
    finally
    {
      System.out.println("program ended");
    }
  }
}
