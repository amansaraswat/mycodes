class Vowel
{
	public static void main (String[] args)
	{
		Scanner obj=new Scanner(System.in);
		char ch=obj.next().charAt(0);
		int code=ch;
		if((code>=65&&code<=97)||(code>=97&&code<=122))
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				System.out.println("Vowel");
			}
			else
				System.out.println("Consonant");
	    }
	    else
	    	System.out.println("please enter a valid alphabate");// your code goes here
	}
}
