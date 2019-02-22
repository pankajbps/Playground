import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
  	Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int count=0;
		 int s=n;
		 while(n!=0)
		 {
			n=n/10;
			 count++;
		 }
		 if(s<0)
		 {
			 count++;
			 }
		
		 char str[]=new char[count];
		 if(s<0)
		 {
			 str[0]='-';
			 s=s*-1;
		 }
		 int i=1;
		 while(s!=0)
		 {
			
			 int r=s%10;
			 s=s/10;
			 str[count-i]=(char)(48+r);
			
			 i++;
		 }
		 System.out.print(str);
  }
}