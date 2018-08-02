import java.util.*;
class demoarray
{
public static void main(String args[])
{
System.out.println("Enter five names");
String [] name=new String[5];
Scanner sc=new Scanner(System.in);
int j=0;
while(j<5){
System.out.println("type a name");
name[j]=sc.next(); 
j++;
}

int i=0;
while(i<5){
System.out.println(name[i]);
i++;
}
}
}

