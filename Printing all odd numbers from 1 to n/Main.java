import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=0;
      for(int i=1;i<=n;i=i+2)
      {
        k=i;
        System.out.println(k);
      }
	}
}