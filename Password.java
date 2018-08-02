import java.util.*;
public class Password
{
  public int calc(int num)
  {
   int rem;
   rem=0;
   while(num>0)
    {
     rem=rem+(num%10);
     num=num/10;
    }
    if(rem<10)
       {
         return rem;
       }
     else
       {
         num=rem;
         return calc(num);
       }
     }      
  
  public static void main(String[] args)
  {
   char pwd[]=new char[4];
   String name;
   int no,b,ref,ref1;
   char[] sym={'#','*','+','-','$','&','=','%','/','@'};
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter your name");
   name=sc.next();
   b=name.length();
   System.out.println("Enter your no");
   no=sc.nextInt();
   char[] a=name.toCharArray();
   Password ob=new Password();
   ref1=no;
   while(ref1<0)
   {
    ref1=ref1/10;
   }
   pwd[2]=(char)ref1;
   ref=ob.calc(no);
   pwd[1]=sym[ref];
   pwd[0]=a[0];
   pwd[3]=a[b-1];
   
   System.out.println(pwd[0]);
   System.out.println(pwd[1]);
   System.out.println(pwd[2]);
   System.out.println(pwd[3]);
  }
}