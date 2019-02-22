import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    	 Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		 int csp=0;
		 for(int i=0;i<str.length();i++)
		 {
			 if(str.charAt(i)==' ')
			 {
				 csp++;
			 }
		 }
		 String sp[]=new String[csp+1];
		 int si=0,k=0;
		 for(int i=0;i<str.length();i++)
		 {
			 if(str.charAt(i)==' ')
			 {
				 sp[k]=str.substring(si, i);
				 si=i+1;
				 k++;
			 }
			 else if(i==str.length()-1)
			 {
				 sp[k]=str.substring(si, i+1);
				 k++;
			 }
		 }
		 StringBuilder sb=new StringBuilder("");
		 for(int i=0;i<k;i++)
		 {
			 for(int j=0;j<sp[i].length();j++)
			 {
				 //char c=sp[i].charAt(j);
				 char d=sp[i].charAt(sp[i].length()-j-1);
				sb.append(d);
			 }
			 sb.append(' ');
		 }
		 System.out.println(sb);
  }
}