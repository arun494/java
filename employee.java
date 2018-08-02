import java.util.*;
public class employee
{
int age,salary,id;
String name;
employee(int id,int age,int salary,String name)
    {
     this.id=id;
     this.name=name;
     this.age=age;
     this.salary=salary;
    }
    public String toString()
    {
        return id+" "+age+" "+salary+" "+name;
    }
          public static void main(String args [])
          {
          int i,a,s;
          String n;
          ArrayList <employee> obj= new ArrayList<employee>();
          Scanner sc=new Scanner(System.in);
          for(int j=0;j<5;j++)
                {
                System.out.println("Enter employee's id,age,name,salary");
                i=sc.nextInt();
                a=sc.nextInt();
                n=sc.next();
                s=sc.nextInt();
                employee emp=new employee(i,a,s,n);
                obj.add(emp);
                }
           
           ListIterator itr=obj.listIterator();
                while(itr.hasNext())
	  {
		System.out.println("item: "+itr.next().toString()+"\t");
	  }
      }
}

               

         
         
         
         