import java.util.*;

class Natural
{
	public static void main(String ag[])
	{
		Scanner obj=new Scanner(System.in);
		int N=obj.nextInt();
		int sum=0;
    if(N>=0)
		{
    while(N!=0)
        {
          sum+=N;
			N--;
        }
		System.out.println(sum);
    }
    else
     System.out.println("invalid input");
 	}
	
}
