import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,j,c,k=1;
      for(i=1;i<=n;i++)
      {
        c=1;
        for(j=1;j<=(2*n)-1;j++)
        {
          if(j<=n-i)
            System.out.print(" ");
          else if(j>n-i&&j<n+i)
          {
            if(c%2!=0)
            {
              System.out.print(k);
              k++;
            }
            else
              System.out.print(" ");
            c++;
          }
          else
             System.out.print(" ");
        }
        System.out.println("");
      }
    }    
}