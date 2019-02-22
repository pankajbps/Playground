import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
       Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int k=sc.nextInt();
		 int []a =new int[n];
		   for(int i=0;i<n;i++)
	        	 a[i]=sc.nextInt();
		   for(int i=1;i<=k;i++)
		   {
			   int count=0;
			   for(int j=0;j<n;j++)
			   {
				   if(i==a[j])
					   count++;
			   }
			   System.out.println(i+" "+count);
		   }
    }
}