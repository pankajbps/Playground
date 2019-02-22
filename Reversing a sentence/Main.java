import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner scn=new Scanner(System.in);
		String data=scn.nextLine();
		int k=data.length();
		StringBuilder sb=new StringBuilder("");
		for(int j=data.length()-1;j>=0;j--)
		{
			if(data.charAt(j)==' ')
			{
				sb=sb.append(data.substring(j+1,k ));
				sb=sb.append(" ");
				//sb=sb+" ";
				k=j;
			}
		}
		sb=sb.append(data.substring(0,k ));
		sb=sb.append(" ");
		System.out.println(sb);
    }
    // Function to reverse a string
  /*  public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
    }*/
}