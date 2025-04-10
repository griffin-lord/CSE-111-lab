import java.util.Scanner;
public class starz{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
       System.out.print(" ");
      }
      for (int t=1;t<=i;t++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}