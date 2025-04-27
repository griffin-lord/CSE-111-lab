public class CheckingAccount extends Account{
  public static int count;
  public double money;
  
  public CheckingAccount(){
    super(0.0);
    count++;
  }
  public CheckingAccount(double c2){
   super(c2);
   count++;
  }
 }