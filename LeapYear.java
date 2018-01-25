import java.util.*;

class LeapYear
{
	public static void main(String ag[])
	{
		Scanner obj=new Scanner(System.in);
		int year=obj.nextInt();
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.print("yes");
				}
				else
				{
					System.out.println("no");
				}
			}
			else
			{
				System.out.println("yes");
			}
		}
		else
		{
			System.out.println("no");
		}
	}
	
}
