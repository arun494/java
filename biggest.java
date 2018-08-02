import java.util.*;
class num
{
public static void main(String args[])
{
System.out.println("Enter three numbers");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b && a>c)
System.out.println("a is largest");
elseif(b>a && b>c)
System.out.println("b is largest");
elseif(c>a && a<c)
System.out.println("c is largest");
else
System.out.println("Enter valid number");

}
}