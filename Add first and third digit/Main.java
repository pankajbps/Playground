import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int n1=num%10;
      int n2=num/100;
      int sum=n1+n2;
      System.out.println(sum);
	}
}