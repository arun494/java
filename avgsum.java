import java.util.*;
public class avgsum
{
public static void main(String args[])
{
float avg;
System.out.println("Enter the average and sum of 10 numbers");
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
int sum=0;
for(int i=1;i<10;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}
System.out.println("sum:"+sum);
avg=sum/10;
System.out.println("avg:"+avg);
}
}
