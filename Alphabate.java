import java.util.*;
import java.lang.*;
import java.io.*;


class Alphabate
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj=new Scanner(System.in);
		char ch=obj.next().charAt(0);
		if((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
		{
			System.out.println("Alphabate");
		}
		else
			System.out.println("No");
	}
}
