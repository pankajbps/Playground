import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      	 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int []a =new int[n];
		   for(int i=0;i<n;i++)
	        	 a[i]=sc.nextInt();
		   int count=0;
		   int k=0;
		   int ca[]=new int[n/2];
		   for(int i=0;i<a.length;i++)
		   {
			   if(a[i]==1)
			   {
				   count++;
			   }
			   else if(count!=0)
			   {
				   ca[k]=count;
				   k++;
				   count=0;
			   }
		   }
		   int index=findMax(ca);
		   System.out.println(ca[index]);
    }
  	public static int  findMax(int a[])
	{
		int max=a[0];
		int loc=0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				loc=i;
			}
		}
		return(loc);
	}
}