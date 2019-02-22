import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner scn=new Scanner(System.in);
		String s;
		s=scn.nextLine();
		boolean b=checkPalindrome(s);
		//System.out.println(b);
		 if(b==true)
				System.out.println("Yes");
		   else
		        System.out.println("No");
    } 
  	public static boolean checkPalindrome(String s)
	{
		boolean b=true;
		for(int i=0;i<(s.length()/2);i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				b=false;
				return(b);
			}
		}
		return(b);
	}
}