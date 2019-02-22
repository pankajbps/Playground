import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int ans=1,sum=0,i,n,rem;
      n=num;
      while(n!=0)
      {
        rem=n%10;
        n=n/10;
        ans=1;
        for(i=1;i<=rem;i++)
          ans=ans*i;
        sum=sum+ans;
      }
      if(sum==num)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}