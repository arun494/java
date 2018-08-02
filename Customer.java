import java.util.*;
import java.io.*;
public class Customer
{
 String  custid,custname,custgender,custaddress,custcity,custcountry,custpin,custphone,customeraof,custdob;          
 int custage;
 Customer(String custid,String custname,String custgender,String custaddress,String custcity,String custcountry,String custpin,String custphone,String customeraof,String custdob,int custage)
 {
  this.custid=custid;
  this.custname=custname;
  this.custgender=custgender;
  this.custaddress=custaddress;
  this.custcity=custcity;
  this.custcountry=custcountry;
  this.custpin=custpin;
  this.custphone=custphone;
  this.customeraof=customeraof;
  this.custdob=custdob;          
  this.custage=custage;
 }
   public String toString()
    {  
        return custid+" "+custname+" "+custgender+" "+custaddress+" "+custcity+" "+custcountry+" "+custpin+" "+custphone+" "+customeraof+" "+custdob+" "+custage;
    }

   public static void main(String args[])
   {
    try
    {
     FileOutputStream fs=new FileOutputStream("C:\\Users\\mruser\\custetailstxt");
     FileInputStream fs1=new FileInputStream("C:\\Users\\mruser\\custetailstxt");
     String cid1,cid,cn1,cn,cg1,cg,ca,cc,ccy,cpi,caof,caof1,cdob1,cdob;
     cid="";
     cg="";
     cn="";
     cn1="";
     cdob="";
     caof="";
     String cp="";
     int cage; 
     ArrayList<Customer> obj=new ArrayList<Customer>();
     Scanner sc=new Scanner(System.in);
     for(int j=0;j<10;j++)
     {
       System.out.println("Customer details required");
       for(int i=0;i>=0;i++)
       {
         System.out.println("Enter your customer id");
         cid1=sc.next();
        if(cid1.startsWith("c")&&cid1.length()==4)
           {
             cid=cid1;
             break;
           }
        else
           {
            System.out.println("Invalid id");
           } 
         }
       for(int i=0;i>=0;i++)
       {
          System.out.println("Enter your name");
          cn1=sc.next();
          if(cn1.equals(""))
            {
              System.out.println("Name cannot be left empty");
            }
          else
           {
              cn=cn1;
              break;    
           }
         }
      for(int i=0;i>=0;i++)
      {
        System.out.println("Enter your gender");
        cg1=sc.next();
        if(cg1.equals("m")||cg1.equals("f"))
           {
            cg=cg1;
            break;
           }
           else
            System.out.println("invalid gender");
       }
      System.out.println("Enter your address");
      ca=sc.next();
      System.out.println("Enter your city");
      cc=sc.next();
      System.out.println("Enter your country");
      ccy=sc.next();
      System.out.println("Enter your pin");
      cpi=sc.next();
      System.out.println("Enter your phone no if not type nil:");
      cp=sc.next();
      
      for(int i=0;i>=0;i++)
      {
       System.out.println("Enter your area of interest");
       caof1=sc.next();
       if(caof1.equals("travel")||caof1.equals("book"))
       {
         caof=caof1;
         break;
       }
       else
       {
         System.out.println("not a specified area of intrest");
       }
      }  
      System.out.println("enter your dob(DDMMYYYY)");
      for(int i=0;i>=0;i++)
      {
       cdob1=sc.next();
       if((cdob1.length())==8)
       {
        int cdate=Integer.parseInt((cdob1.substring(0,2)));
        int cmon=Integer.parseInt((cdob1.substring(2,4)));
        int cyear=Integer.parseInt((cdob1.substring(4)));
        if(cdate<32&&cmon<13&&cyear<2018&&cyear>1900)
        {
          cdob=cdob1;
          break;
        }
       else
         System.out.println("not a valid date");
        }
       else
         System.out.println("not a valid date");
      }
      System.out.println("Enter your age");
      cage=sc.nextInt();
      
       Customer cds=new Customer(cid,cn,cg,ca,cc,ccy,cpi,cp,caof,cdob,cage);
       obj.add(cds);
      }

       int k=0;
       String s[]=new String[100];
       ListIterator itr=obj.listIterator();
       while(itr.hasNext())
       {
         s[k]=itr.next().toString();
         s[k]=s[k]+"\r\n";
         byte[] b=s[k].getBytes();
         fs.write(b);
         k++;
       }
 
   int m=0;
   String sread="";
   while((m=fs1.read())!=-1)
   {
     sread=sread+Character.toString(((char)m));

   }
    System.out.println(sread);

    String sr[]=sread.split("\n");
    String country[]=new String[10];
    String gender[]=new String[10];       
    String interest[]=new String[10]; 
    int age[]=new int[10];
    String phno[]=new String[10];
          


      String s0[]=sr[0].split(" ");
      String s1[]=sr[1].split(" ");
      String s2[]=sr[2].split(" ");
      String s3[]=sr[3].split(" ");
      String s4[]=sr[4].split(" ");
      String s5[]=sr[5].split(" ");
      String s6[]=sr[6].split(" ");
      String s7[]=sr[7].split(" ");
      String s8[]=sr[8].split(" ");
      String s9[]=sr[9].split(" ");  


        gender[0]=s0[2];
        gender[1]=s1[2];
        gender[2]=s2[2];
        gender[3]=s3[2];
        gender[4]=s4[2];
        gender[5]=s5[2];
        gender[6]=s6[2];
        gender[7]=s7[2];
        gender[8]=s8[2];
        gender[9]=s9[2];
 
        country[0]=s0[5];
        country[1]=s1[5];
        country[2]=s2[5];
        country[3]=s3[5];
        country[4]=s4[5];
        country[5]=s5[5];
        country[6]=s6[5];
        country[7]=s7[5];
        country[8]=s8[5];
        country[9]=s9[5];

        age[0]=Integer.parseInt(s0[10].trim());
        age[1]=Integer.parseInt(s1[10].trim());
        age[2]=Integer.parseInt(s2[10].trim());
        age[3]=Integer.parseInt(s3[10].trim());
        age[4]=Integer.parseInt(s4[10].trim());
        age[5]=Integer.parseInt(s5[10].trim());
        age[6]=Integer.parseInt(s6[10].trim());
        age[7]=Integer.parseInt(s7[10].trim());
        age[8]=Integer.parseInt(s8[10].trim());
        age[9]=Integer.parseInt(s9[10].trim());

        interest[0]=s0[8];
        interest[1]=s1[8];
        interest[2]=s2[8];
        interest[3]=s3[8];
        interest[4]=s4[8];
        interest[5]=s5[8];
        interest[6]=s6[8];
        interest[7]=s7[8];
        interest[8]=s8[8];
        interest[9]=s9[8];
      
        phno[0]=s0[7];
        phno[1]=s1[7];
        phno[2]=s2[7];
        phno[3]=s3[7];
        phno[4]=s4[7];
        phno[5]=s5[7];
        phno[6]=s6[7];
        phno[7]=s7[7];
        phno[8]=s8[7];
        phno[9]=s9[7];

        int male=0;
        int female=0;
        int ages=0;
        int travel=0;
        int book=0;
        int phone=0;
      for(int i=0;i<10;i++)
       {
        if(gender[i].equals("m"))
            male++;
        else
            female++;     
        if(age[i]>18)
              ages++;
         if(interest[i].equals("travel"))
               travel++;
         else
              book++;
         if(phno[i].equals("nil"))
                phone++;
        }

         //for(String i :s0){System.out.println(i);}     

    //   for(int l=0;l<2;l++)
    //        System.out.println(s[l]);
             
       fs.close();


  /*      ListIterator itr=obj.listIterator();
       while(itr.hasNext())
       {
         System.out.println("details: "+itr.next().toString()+"\t");
       }
   */ 
    System.out.println("male customers:"+male);
    System.out.println("female customers:"+female);
    System.out.println("no of customers who likes traveling:"+travel);
    System.out.println("no of customers who likes reading book:"+book);
    System.out.println("no of customers whose age is above 18:"+ages);
    System.out.println("no of customers who dont have any phone no:"+phone);  
    System.out.println("customers by countrywise");
    Arrays.sort(country);
    int ar[]={0,0,0,0,0,0,0,0,0,0};
    Arrays.sort(country);
    
    for(int i=0;i<10;i++)
    {
     for(int j=0;j<10;j++)
     {
       if(country[i].equals(country[j]))
       {
         ar[i]++;
       }
     }
    if(i<9)
     {
      if(country[i].equals(country[i+1]))
         continue;
     }
     System.out.println(country[i]+""+ar[i]);
    } 
  } 
   
    catch(IOException e)
     {
       System.out.println(e);
     }     
  }
     
}      

     








