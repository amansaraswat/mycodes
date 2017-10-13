import java.util.*;

class CompareSign{
public static void main(String as[])
{
 Scanner ob=new Scanner(System.in);
 int a=ob.nextInt();
 char s=a>0?'p':'n';
 System.out.println("P: positive \n n: negative \nz: zero");
 if(s!='p'&&s!='n')
   System.out.println("z");
 else
  System.out.println(s);
}
}
