public class Mango extends Fruit{ 
  public static String nam ="Mango";
  public static boolean ty=true;
  
  public Mango(){
   super(ty,nam); 
  }
    public String toString(){
    return nam+"s are bad for you";
  }
}