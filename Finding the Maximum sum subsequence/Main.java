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
			   int subseq[]=new int[2*n];
		   int sid=0,eid=0,k=0;
		   for(int i=0;i<a.length-1;i++)
		   {
			   if(a[i+1]<a[i])
			   {
				   eid=i;
				   subseq[k]=sid;
				   subseq[k+1]=eid;
				   k+=2;
				   sid=eid+1;
			   }
			   else if(i==a.length-2)
			   {
				   eid=a.length-1;
				   subseq[k]=sid;
				   subseq[k+1]=eid;
				   k=k+2;
			   }
		   }
		  /* for(int i=0;i<k;i++)
			   System.out.print(subseq[i]+" ");*/
		   int sumsubseq[]=new int[k/2];
		   int count=0;
		   int p=0;
		   for(int i=0;i<k/2;i=i+1)
		   {
			   int sum=0;
			   for(int j=subseq[p];j<=subseq[p+1];j++)
			   {
				   sum=sum+a[j];
			   }
			   sumsubseq[count]=sum;
			   count++;
			   p=p+2;
		   }
		  /* for(int i=0;i<count;i++)
			   System.out.print(sumsubseq[i]+" ");*/
		   int index=findMax(sumsubseq);
		   System.out.println(sumsubseq[index]);
  }
  	public static int  findMax(int a[])
	{
		int max=a[0];
		int loc=0;
		for(int i=1;i<a.length;i++)
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