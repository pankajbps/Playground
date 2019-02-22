import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int num=in.nextInt();
      int i,j,k=1;
      for(i=1;i<=num;i++)
      {
        for(j=1;j<=i;j++)
        {
          if(k%2!=0)
            System.out.print("*");
          else
             System.out.print("#");
          k++;
        }
        System.out.println("");
      }
    }
}