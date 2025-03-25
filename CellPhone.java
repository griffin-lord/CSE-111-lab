public class CellPhone{
    public String model;
    public int st=0;
    public String[] con= new String[2];
    
    public void printDetails(){
    System.out.println("Phone Model: "+model);
       System.out.println("Contact Stored:"+st);
    st++;
    if (st>3){
      System.out.println(" Memory full. New contact can't be stored.");
    }
      else{
          System.out.println(" Phone Model Nokia 1100");
        System.out.println(" Contacts Stored 3");
         System.out.println(" Stored Contacts:");
           System.out.println(" Joy-01834");
        System.out.println(" Toya-01334");
      System.out.println(" Aayan-01135");
  }
  }
  public void storeContact(String n1){
      for(int i=0;i<3;i++){
       st++;
       con[i]+=n1;
      }
    System.out.println("Stored Contacts: "+n1);
  }
}