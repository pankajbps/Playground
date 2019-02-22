import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int a[]=new int[num];
      for(int i=0;i<num;i++)
        a[i]=sc.nextInt();
      int se=sc.nextInt();
      int se2=sc.nextInt();
      int loc=-1,loc2=-1;
      for(int i=0;i<num;i++)
      {
        if(a[i]==se)
          loc=i;
        if(a[i]==se2)
          loc2=i;
      }
      System.out.println(loc);
      System.out.println(loc2);
    }
}