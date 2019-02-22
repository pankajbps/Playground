import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
     Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 String str[]=new String[n];
		 for(int i=0;i<n;i++)
		 {
			 str[i]=sc.next();
		 }
     for(int i=0;i<n;i++)
		 {
			 str[i]=str[i].toLowerCase();
		 }
		 for(int i=0;i<n-1;i++)
		 {
			 for(int j=0;j<n-1-i;j++)
			 {
				 boolean b=changeOrder(str[j],str[j+1]);
				 if(b)
				 {
					 String t=str[j];
					 str[j]=str[j+1];
					 str[j+1]=t;
				 }
			 }
			/* for(int k=0;k<n;k++)
				 System.out.print(str[k]+" ");
			 System.out.println("");*/
		 }
		 for(int i=0;i<n;i++)
			 System.out.println(str[i]);
  }
  public static boolean changeOrder(String str1,String str2)
	{
		int i=0;
		while(i<str1.length()&&i<str2.length())
		{
			if(str1.charAt(i)==str2.charAt(i))
			{
			i++;
			}
			else if(str1.charAt(i)>str2.charAt(i))
				return(true);
			else
				return(false);
		}
		return(false);
	}
}