import java.util.*;
public class calculator
{
   public static void main(String args[])
   {
   int a,b;
   
   int opt;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the value of a");
   System.out.println("Enter the value of b");
   a=sc.nextInt();
   b=sc.nextInt();
   opt=sc.nextInt();
   switch(opt)
      {
      case 1:
      System.out.println(a+b);
      break;
      case 2:
      System.out.println(a-b);
      break;
      case 3:
      System.out.println(a*b);
      break;
      case 4:
      System.out.println(a/b);
      break;
      case 5:
      System.out.println(a%b);
      break;
      case 6:
      System.out.println(a%b);
      break;
      default: 
      System.out.println("Invalid");
      }

   }
}
  