import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int ld=num%10;
      int sd=0;
      while(num>=10)
      {
        num=num/10;
        sd=num;
      }
      int sum=ld+sd;
      System.out.println(sum);
	}
}