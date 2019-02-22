import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
     int e=sc.nextInt();
    int res=power(b,e);
    System.out.println(res);
  }
  public static int power(int b, int e)
  {
    int ans=1;
    for(int i=1;i<=e;i++)
        ans=ans*b;
      return(ans);
  }
  
}