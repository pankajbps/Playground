import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
       Scanner sc=new Scanner(System.in);
	        String st=sc.nextLine();
	      String st1=sc.next();
	      String st2=sc.next();
	      System.out.println(st.replace(st1, st2));
    }
}