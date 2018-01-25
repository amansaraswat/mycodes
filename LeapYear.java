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
					System.out.print("leap year");
				}
				else
				{
					System.out.println("not leap year");
				}
			}
			else
			{
				System.out.println("leap year");
			}
		}
		else
		{
			System.out.println("not leap year");
		}
	}
	
}
