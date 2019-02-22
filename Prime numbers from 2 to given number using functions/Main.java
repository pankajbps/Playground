import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    // int e=sc.nextInt();
    prime(n);
   // System.out.println(res);
	}
  public static void prime(int n)
  {
    int flag=0;
    for(int i=2;i<=n;i++)
    {
      flag=0;
      for(int j=2;j<=(i/2);j++)
      {
        if(i%j==0)
        {
          flag=1;
          break;
        }
      }
      if(flag==0)
        System.out.println(i);
    }
  }
}