import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
     Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		 String rs=sc.next();
		 StringBuilder sb=new StringBuilder(str);
		 for(int i=0;i<rs.length();i++)
		 {
			 char c=rs.charAt(i);
			 for(int j=0;j<sb.length();j++)
			 {
				 if(c==sb.charAt(j))
					 sb.deleteCharAt(j);
			 }
		 }
		 System.out.println(sb);
    
  }
}