import java.util.Scanner;
class arsearch
{
int [] a;
void readarray()
{
a= new int[5];
Scanner r=new Scanner(System.in);
System.out.println("Enter the elements : ");
for(int i=0;i<5;i++)
{
a[i]=r.nextInt();
}
}
void printarray()
{
System.out.println("Array Elements are : ");
for(int i=0;i<5;i++)
{
System.out.println(a[i]);
}
}
void searcharray()
{
int x,find=0;
System.out.println("Enter the element to be Search : ");
Scanner r=new Scanner(System.in);
x=r.nextInt();
for(int i=0;i<5;i++)
{
if(a[i]==x)
{
find=1;
break;
}
else
{
find=0;
}
}
if(find==1)
{
System.out.println("Element found ");
}
else
{
System.out.println("Element not found");
}
}
public static void main(String[] args)
{
arsearch obj=new arsearch();
obj.readarray();
obj.printarray();
obj.searcharray();
}
}