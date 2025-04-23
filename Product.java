public class Product{
  private String name;
  private double mon;
  private int quant;
  
  public Product(){
   name="Unknown";
   mon=0.0;
  }
  
  public Product(String nl,double a1){
   name=nl;
   mon=a1;
  }
  
  public void displayInfo(){
   System.out.println("Product Name: "+name);
   System.out.println("Price: $"+mon);
  }
  
  public void setQuantity(int ew){
    quant=ew;
  }
  
  public void displayInfo(boolean sa){
    if(sa==true){
      System.out.println("Product Name: "+name);
      System.out.println("Price: $"+mon);
      System.out.println("Quantity: "+quant);
    }
  }
    public double getPrice(){
     return mon; 
    }
    public int getQuantity(){
     return quant; 
    }
  }