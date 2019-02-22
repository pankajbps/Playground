import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int ans=find_sum(n);
      System.out.println(ans);
	}
  public static int find_sum(int n)
  {
    int sum=0;
    for(int i=1;i<=n;i++)
      sum=sum+i;
    return(sum);
  }
}