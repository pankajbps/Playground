import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,j;
      for(i=1;i<=n;i++)
      {
        for(j=n-i+1;j>=1;j--)
          System.out.print(j);
           System.out.println("");
      }
   
	}
}