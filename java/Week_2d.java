import java.util.*;
 class twoDimArr 
{
public static void main(String args[])
{
System.out.print("Enter the size of 2d array : ");
Scanner sc = new Scanner(System.in);
int m = sc.nextInt();
int n = sc.nextInt();
int a[][] = new int[m][n];
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print("Enter the number of items in the year "+(i+1)+" with the student id "+(j+1)+" : ");

a[i][j] = sc.nextInt();
}
}
int max = a[0][0];
int year=0, id=0;
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
if(a[i][j]>max)
{
max=a[i][j];
year = i;
id = j;
}
}
}
System.out.println("The year and id of the item which has more demand is "+(year+1)+", "+(id+1));

}
}