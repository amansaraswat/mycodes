import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    try{
	    Scanner obj=new Scanner(System.in);
	    int n=obj.nextInt();
	    int p,rev=0,rem;
	    int x=n;
	    if(n<=1000)
	    {
	        while(x!=0)
	        {
	            rem=x%10;
	            rev=rev*10+rem;
	            x=x/10;
	        }
	        if(rev==n)
	        {
	            System.out.print("yes");
	        }
	        else
	        {
	            System.out.print("no");
	        }
	    }
	    else
	        System.out.print("enter a value less than or equal to 1000");
	    }catch(Exception e)
	    {
	        System.out.print(e);
	    }
	}
}
