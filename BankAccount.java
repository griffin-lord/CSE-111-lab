public class BankAccount {
  public int n;
  public String m;
  public BankAccount() {
     this.n = 0;
     this.m ="Not Set";
    }
  public BankAccount(int n, String m) {
        this.n = n;
        this.m = m;
    }
    public void setInfo(int n, String m) {
    System.out.println("Account information updated!");
     this.n = n;
     this.m = m;
    }
    public String printDetails() {
     return ("Account Number: " + this.n + "\nAccount Type: " + this.m);
    }
}

 