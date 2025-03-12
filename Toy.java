public class Toy{
  public String name;
  public int pr;
  
  public Toy(String na,int p){
    name=na;
    pr=p;
    System.out.println("A new toy has been made!");
  }
  
  public void updatePrice(int prr){
    pr=prr;
  }
  
  public void updateName(String up){
    name=up;
  }
  
  public void showPrice(){
    System.out.println("Price: "+pr);
  }
 }
  
  