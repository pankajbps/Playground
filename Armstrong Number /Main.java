import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      int sum=1,rem,num,ans=0;
      num=n;
      while(num!=0)
      {
        num=num/10;
        count++;
      }
      num=n;
      while(num!=0)
      {
        rem=num%10;
        num=num/10;
        sum=1;
        for(int i=0;i<count;i++)
          sum=sum*rem;
        ans=ans+sum;
      }
     // System.out.println(ans);
      if(ans==n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}