import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int i;
      for(i=1;i<=num;i++)
        if(num%i==0)
          System.out.println(i);
	}
}