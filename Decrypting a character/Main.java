import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      char c=sc.next().charAt(0);
      int key=sc.nextInt();
      int res=c-key;
      if(c>97)
      {
      if(res<97)
      {
        char ans=(char)(123-97+res);
        System.out.println(ans);
      }
      else
      {
        char ans=(char)res;
        System.out.println(ans);
      }
    }
      else
      {
            if(res<65)
      {
        char ans=(char)(91-65+res);
        System.out.println(ans);
      }
      else
      {
        char ans=(char)res;
        System.out.println(ans);
      }
      }
    }
}