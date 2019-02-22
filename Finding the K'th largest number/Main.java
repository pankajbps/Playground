import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
       Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int []a =new int[n];
		   for(int i=0;i<n;i++)
	        	 a[i]=sc.nextInt();
		 int kL=sc.nextInt();
		 for(int i=0;i<a.length;i++)
		 {
			 int loc=findmin(i,a);
			 int temp=a[i];
			 a[i]=a[loc];
			 a[loc]=temp;
		 }
		 System.out.println(a[a.length-kL]);
    }   
  	public static int findmin(int k,int[]a)
	{
		int min=a[k];
		int loc=k;
		for(int i=k+1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
				loc=i;
			}
		}
		return(loc);
	
}
}