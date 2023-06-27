import java.util.Scanner;
class shape
{
static int area(int a){return a*a;}
static int area(int a,int b){return a*b;}
static double area(double a){return 3.14*a*a;}
}
class overshape
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length :");
int a= sc.nextInt();
System.out.println("Enter the breadth :");
int b= sc.nextInt();
System.out.println("Enter the radius :");
double c=sc.nextDouble();
System.out.println("Area of the square :"+shape.area(a));
System.out.println("Area of rectangle :"+shape.area(a,b));
System.out.println("Area of circle :"+shape.area(c));
}
}
