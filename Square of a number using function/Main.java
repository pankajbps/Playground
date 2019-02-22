import java.util.Scanner;
class Main
{
 
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int ans=find_square(n);
      System.out.println(ans);
	} 
   public static int find_square(int n)
  {
    int a=n*n;
    return(a);
  }
}