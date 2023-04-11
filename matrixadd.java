import java.util.Scanner;
class matrixadd
{
public static void main(String args[])
{
int a,b,i,j;
Scanner in=new Scanner(System.in);
System.out.println("Enter the no:of rows:");
a=in.nextInt();
System.out.println("Enter the no:of columns:");
b=in.nextInt();
int m1[][]=new int[a][b];
int m2[][]=new int[a][b];
int res[][]=new int[a][b];
System.out.println("Enter the elements of matrix1");
for(i=0;i<a;i++)
{ 
for(j=0;j<b;j++)
m1[i][j]=in.nextInt();
System.out.println();
}
System.out.println("Enter the elements of matrix2");
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
m2[i][j]=in.nextInt();
System.out.println();
}
for(i=0;i<a;i++)
for(j=0;j<b;j++)
res[i][j] = m1[i][j] + m2[i][j] ; 
System.out.println("Addition of matrices:-");
for(i=0;i<a;i++)
{ 
for(j=0;j<b;j++)
System.out.print(res[i][j]+"\t");
System.out.println();
}
}
}