public class Playlist{
  public String plau;
  public Song start=null;
  public int cou=1;
  
  public Playlist(String cn){
    plau=cn;
    System.out.println(plau+" created. ");
  }
   
  public void info(){
    if (start == null) {
    System.out.println("No songs in "+plau+ ".");
    }
    else{
    Song curs=start;
    while(curs!=null){
    System.out.println(plau+" has the following songs: ");
    System.out.println("Song- " + cou);
    curs.songInfo();
    curs=curs.next;
    cou++;
    }
   }
  }
  public void addSong(Song n1) {
   if (start==null){
    start=n1;
    } 
     else {
      Song curs= start;
      while (curs.next!=null) {
      curs=curs.next;
     }
      curs.next=n1;
   }
  System.out.println(n1.son + " added to " +plau);
    }
  public void addSong(Song n2, int ds) {
    start=n2;
  System.out.println(n2.son + " added to " +plau);
    }
}