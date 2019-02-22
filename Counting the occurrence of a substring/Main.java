import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    	Scanner scn=new Scanner(System.in);
		String data=scn.nextLine();
		String text=scn.next();
		int count=0;
		for(int i=0;i<data.length();i++)
		{
			boolean b=checkString(data,text,i);
			//System.out.println(b);
			if(b==true)
				count++;
			//System.out.print(i);
		}
		//System.out.println("beelow");
		System.out.println(count);
  } 
  public static boolean checkString(String data,String text,int i)
	{
		//int flag=0;
		int k;
		for( k=0;(k<text.length()&&i<data.length());k++)
		{
			//flag=1;
			if(data.charAt(i)!=text.charAt(k))
				return(false);
			i++;
		}
		if(k!=text.length())
		return(false);
		return(true);
	}
}