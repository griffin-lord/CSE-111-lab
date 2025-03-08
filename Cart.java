public class Cart {
    public int cart;
    String[] carIt = new String[3];
    double[] carPr = new double[3];
    int cou = 0;
    double discount = 0.0;
  public void create_cart(int cart) {
        this.cart = cart;
    }
  public void addItem(String i, double p) {
     if (cou<3) {
       carIt[cou] = i;
       carPr[cou] = p;
       cou++;
       System.out.println(i+" added to cart "+cart+ ".");
       System.out.println("You have "+cou+" item(s) in your cart now.");
        } 
      else{
            System.out.println("You already have 3 items in your cart");
        }
    }
   public void addItem(double p, String i) {
     if (cou<3) {
       carIt[cou] = i;
       carPr[cou] = p;
       cou++;
       System.out.println(i+" added to cart "+cart+ ".");
       System.out.println("You have "+cou+" item(s) in your cart now.");
        } 
      else{
            System.out.println("You already have 3 items in your cart");
        }
   }
    
   public void giveDiscount(double discount) {
        this.discount = discount;
    }

   public void cartDetails() {
        System.out.println("Your cart(c"+cart+"):");
        double cartPr=0.0;
        for (int i=0;i<cou;i++) {
            System.out.println(carIt[i]+" - "+carPr[i]);
            cartPr+=carPr[i];
        }
    double discountAmount = cartPr*(discount/100);
    cartPr-=discountAmount;
    System.out.println("Discount Applied: "+discount+"%");
    System.out.println("Total price: " + cartPr);
  }
}


