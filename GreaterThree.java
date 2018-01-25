import java.util.Scanner;

class GreaterThree
{
  public static void main(String ag[])
    {
     int a,b,c;
     Scanner obj=new Scanner(System.in);
     a=obj.nextInt();
     b=obj.nextInt();
     c=obj.nextInt();     
     if(a>b)
     {
      if(a>c)
      System.out.print(a);
      else
      System.out.print(c);
     }
     if(b>c)
      System.out.print(b);
     else
       System.out.print(c);
    }
}
