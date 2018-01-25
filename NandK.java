import java.util.*;

class NandK
{
	public static void main(String ag[])
	{
		Scanner obj=new Scanner(System.in);
		int N=obj.nextInt(); 
        int K=obj.nextInt();
		int sum=0;
        int arr[]=new int[100];
       if((N<100)&&(K<=N)){
         for(int i=0,j=0;j<K;i++,j++){
			arr[i]=obj.nextInt();
            sum=sum+arr[j];
  				}
        System.out.println(sum);
       }
	else
		System.out.println("N should be less than 100 and K should be less than N");
     }
	
}
