import java.util.*;

class Main
{
	public static void main(String ag[])
	{
		Scanner obj=new Scanner(System.in);
		int N=obj.nextInt();
		int x=N,c=0;
		
		while(x>0)
		{
		    x=x/10;
		    c++;
		}
		System.out.println(c);
	}    
	
}
