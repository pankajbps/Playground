import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int i,j;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=(2*n)-1;j++)
        {
          if(j<=n-i)
            System.out.print(" ");
          else if(j>n-i&&j<n+i)
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.println("");
      }
	}
}