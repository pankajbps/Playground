import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
      String st2=sc.next();
       /* StringBuilder sb=new StringBuilder(st);
      sb.append(st);*/
      st=st+st;
      int flag=0;
      for(int i=0;i<=st2.length();i++)
      {
        String check=st.substring(i,st2.length()+i);
        if(check.equals(st2))
        {
        	System.out.println("Yes");
        	flag=1;
        }
    }
      if(flag==0)
    	 	System.out.println("No");
    }
}