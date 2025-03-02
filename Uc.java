import java.util.Scanner;
public class Uc{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=4;i<=n;i++){
      for(int j=1;j<=i;j--){
        System.out.print("#");
      }
      System.out.println();
    }
  }
}