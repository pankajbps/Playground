import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=-1;
      for(int i=1;i<=n;i++)
      {
        k=k+2;
        System.out.println(k);
      }
	}
}