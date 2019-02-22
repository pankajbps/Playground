import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++)
      list[i]=sc.nextInt();
    int ans=findmax(list,n);
    System.out.println(ans);
  }
  public static int findmax(int arr[],int n)
  {
    int max=arr[0];
    int loc=0;
    for(int i=1;i<n;i++)
    {
      if(max<arr[i])
      {
        max=arr[i];
        loc=i;
      }
    }
    return(loc);
  }
}