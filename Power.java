import java.util.*;

public class Power
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    try{
	    int num=obj.nextInt();
	    int pow=obj.nextInt();
	    int a=1;
	    
	    for(int i=1;i<=pow;i++)
	    {
	        a=a*num;
	    }
	    System.out.print(a);
	    }catch(Exception e)
	    {
	        System.out.print("invalid input");
	    }
	}
}



