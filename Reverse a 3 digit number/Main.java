import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int f=num/100;
    int s=((num/10)%10);
    int t=num%10;
    int r=t*100+s*10+f;
    System.out.println(r);
  }
}