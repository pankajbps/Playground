import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    	 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int []a =new int[n];
		   for(int i=0;i<n;i++)
	        	 a[i]=sc.nextInt();
		   int uniqueArr[]=new int[n];
		   uniqueArr[0]=a[0];
		   int count=0;
		   count++;
		   for(int i=0;i<n;i++)
		   {
			   boolean b=checkUniqueElement(uniqueArr,count,a[i]);
			   if(b==true)
			   {
				   uniqueArr[count]=a[i];
				   count++;
			   }
		   }
		  /* for(int i=0;i<count;i++)
			   System.out.print(uniqueArr[i]+" ");*/
		   int freqArr[]=new int[count];
		   for(int i=0;i<count;i++)
		   {
			  int freq= findFreq(uniqueArr[i],a);
			  freqArr[i]=freq;
		   }
		   int index=findMax(freqArr);
		   System.out.println(uniqueArr[index]);
  }
  	public static boolean checkUniqueElement(int a[],int k,int c)
	{
		for(int i=0;i<k;i++)
		{
			if(a[i]==c)
			{
				return(false);
				
			}
		}
		return(true);
	}
	public static int findFreq(int c,int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(c==a[i])
				count++;
		}
		return(count);
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