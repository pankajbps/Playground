import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int i,j;
      for(i=1;i<=num;i++)
      {
        for(j=1;j<=num;j++)
          System.out.print(i);
           System.out.println("");
      }
   
	}
}