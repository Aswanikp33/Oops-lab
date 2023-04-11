import java.util.Scanner;
class matarray
{
public static void main(String args[])
{
int a,b;
int count=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size of rows in array:");
a= sc.nextInt();
System.out.print("Enter the size of columns of array:");
b =sc.nextInt();
int[][] arr = new int[20][20];  
System.out.println("Enter the element:");
for(int i=0;i<a;i++)
for(int j=0;j<b;j++)
arr[i][j]= sc.nextInt();
System.out.println("Array elemts are:");
for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println(" ");
}
}
}