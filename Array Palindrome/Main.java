import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        	 a[i]=sc.nextInt();
        for(int i=0;i<(n/2);i++)
        {
        	if(a[i]!=a[n-i-1])
        	{
        		flag=1;
        		break;
        		
        	}
        }
        if(flag==0)
        	System.out.println("Yes");
        else
        	System.out.println("No");
    }
}