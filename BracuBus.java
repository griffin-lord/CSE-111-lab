public class BracuBus{
  public int cou=2;
  public String home;
  public int pasSco=0;
   public String names=" ";
  public BracuBus(String place){
    home=place;
  }
  public BracuBus(String place1,int co){
    home=place1;
    cou=co;
  }
  public void showDetails(){
    System.out.println("Bus Route: "+home);
    System.out.println("Passenger Count: "+pasSco+ "(MAX: "+cou+")");
    System.out.println("Passengers on Board:"+names);
  }
  public void board(){
    System.out.println("No passengers");
  }
    public void board (BracuStudent n2){
    System.out.println(n2.nam+" boarded the bus");
      pasSco++;
}
  public void board(BracuStudent b4,BracuStudent c4){
   names+=b4.nam;
    if ((this.home != b4.hom || this.home != c4.hom) && (b4.c2 == false || c4.c2 == false)){
      System.out.println("You don't have a bus pass!");
      System.out.println("You got on the wrong bus!");
    }
   if (this.home == b4.hom || this.home == c4.hom){
      System.out.println(b4.nam+ " boarded the bus");
       pasSco+=2;
    }
    if(pasSco>cou){
       System.out.println("Bus is full!");
    }
  }
}