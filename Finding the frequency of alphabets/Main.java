import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
        String st=sc.next();
        StringBuilder sb=new StringBuilder("");
      
        char[] stat=new char[26];
        if(st.charAt(0)>='a'&&st.charAt(0)<='z')
        stat[0]=st.charAt(0);
        else if(st.charAt(0)>='A'&&st.charAt(0)<='Z')
        {
        	//st.charAt(0)+=32;
        	char c=st.charAt(0);
        	c+=32;
            stat[0]=c;
        }
        int k=0;
        for(int i=1;i<st.length();i++)
        {
        	char c=st.charAt(i);
        	k=uniChar(k,c,stat);
        }
       // System.out.println(sb);
       /* for(int i=0;i<=k;i++)
        	System.out.println(stat[i]);*/
        for(int i=0;i<=k;i++)
        {
        	int count=countChar(stat[i],st);
        	String s=""+stat[i]+count;
        	sb=sb.append(s+" ");
        }
        System.out.println(sb);
    }
  	public static int uniChar(int k,char c,char[] stat)
	{
		
		for(int i=0;i<=k;i++)
		{
			if(stat[i]==c||stat[i]==c+32)
				return k;
		}
		//int p=stat.length;
		if(c>='a'&&c<='z')
		stat[k+1]=c;
		else if(c>='A'&&c<='Z')
		{
			//int j=c;
			c+=32;
			stat[k+1]=c;
		}
		return(k+1);
		
	}
	public static int countChar(char c,String st)
	{
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			if(c==st.charAt(i)||c==st.charAt(i)+32)
				count++;
		}
		return(count);
		
	}
}