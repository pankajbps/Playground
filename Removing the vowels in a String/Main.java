import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
     Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		 StringBuilder sb=new StringBuilder("");
		 for(int i=0;i<str.length();i++)
		 {
			 char c=str.charAt(i);
			/* if((c!='a'||c!='A')&& (c!='e'||c!='E') && (c!='i'||c!='I') && (c!='o'||c!='O') && (c!='u'||c!='U'))
			 {
				 sb.append(c);
			 } */
			 if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
			 {
				 
			 }
			 else
			 {
				 sb.append(c);
			 }
			/* else 
			 {
				 
			 }*/
			// System.out.println(sb);
				 
		 }
		 System.out.println(sb);
  }
}