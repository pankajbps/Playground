import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      	Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        char[] stat=new char[26];
        //System.out.println(st.length());
        for(int i=0;i<26;i++)
        	stat[i]=0;
        for(int i=0;i<st.length();i++)
        {
        	 if(st.charAt(i)>='a'&&st.charAt(i)<='z')
        	 {
        		 char c=st.charAt(i);
        		 c-=97;
        		 stat[c]++;
        	 }
        	 else if(st.charAt(i)>='A'&&st.charAt(i)<='Z')
        	 {
        		 char c=st.charAt(i);
        		 c-=65;
        		 stat[c]++;
        	 }
        }
        for(int i=0;i<26;i++)
        {
        	if(stat[i]==0)
        	{
        		char c=97;
        		c+=i;
        		//String s=c;
        		//sb=sb+
        		System.out.print(c+" ");
        	}
        }
    }
}