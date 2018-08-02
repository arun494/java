import java.util.*;
/*
public class Reverse
{
   public static void main(String args[])
    {
       int b;
       String st;
       System.out.println("Enter a string that you want to reverse");
       Scanner sc=new Scanner(System.in);
       st=sc.next();
       b=st.length(); 
       char[] a=st.toCharArray();
       for(int i=b-1;i>=0;i--)
         {
            System.out.print(a[i]);
         }
   } 
}
*/
import java.util.*;

public class Reverse
{
  public static void main(String args[])
  {
   System.out.println("Enter a no that u want to reverse");
   Scanner sc=new Scanner(System.in);
   int no=sc.nextInt();
   int rem=0;
   int rev=0;
   while(no>0)
   { 
      rem=no%10;
      rev=(rev*10)+rem;   
      no=no/10;  
}
 System.out.println(rev);
}      
}











        