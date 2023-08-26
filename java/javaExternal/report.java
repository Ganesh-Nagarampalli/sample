package report;
import students.student;
import sports.sports;
public class report
{
    public static void main(String[] args)
    {
        student obj1 = new student();
        System.out.println("name of the student : "+obj1.name);
        System.out.println("Roll no : "+obj1.roll_no);
        System.out.println("name of the sport : "+sports.sname);
        System.out.println("score : "+sports.score);

    }    
}
