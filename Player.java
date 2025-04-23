public class Player{
  public static String name;
  public static int jer;
  public static String count;
  public static int total;
  public static String nam=" " ;
  
  public Player(String n2, String c4,int n3){
   name=n2;
   count=c4;
   jer=n3;
   total++;
   nam+=n2;
  }
  public String player_detail(){
    return "Player Name: "+name+"\njersey Number: "+jer+"\nCountry: "+count;
  }
  public static void info(){
    if(total<=10){
    System.out.println("Total number of players: "+total);
    System.out.println("Player enlisted so far: "+nam);
    }
  }
}