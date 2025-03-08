public class BankAccount {
  public int n;
  public String m;
  public void BankAccount() {
     this.n = n;
     this.m = "Not set";
    }
    public void setInfo(int n, String m) {
    System.out.println("Account information updated!");
     this.n = n;
     this.m = m;
    }
    public String printDetails() {
     return ("Account Number: "+this.n+" Account Type: "+this.m);
    }
}

 