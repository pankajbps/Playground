import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int a[]=new int[num];
      for(int i=0;i<num;i++)
        a[i]=sc.nextInt();
      int max=a[0];
      for(int i=1;i<num;i++)
      {
        if(max<a[i])
          max=a[i];
      }
      System.out.println(max);
    }
}