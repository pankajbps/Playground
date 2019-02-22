import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
          Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	        int flag=0;
	      int k=0;
	       int a[]=new int[n];
	        for(int i=0;i<n;i++)
	        	 a[i]=sc.nextInt();
	    //  int a[]= {5,3,2,3,1};
	      for(int i=1;i<=n;i++)
	      {
	    	  flag=0;
	        for(int j=0;j<a.length;j++)
	        {
	          if(i==a[j])
	          {
	            flag=1;
	            break;
	          }
	        }
	        if(flag==0)
	        {
	           //k=i;
	 	       System.out.println(i);
	          break;
	        }
	      } 
    }
}