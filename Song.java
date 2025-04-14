public class Song{
  public String son;
  public String art;
  public int lengt;
  public Song next;
  
  public Song(String s1,String s2,int f3){
    son=s1;
    art=s2;
    lengt=f3;  
  }
  
  public void songInfo(){
   System.out.println("Title:"+ son +" Artist:"+art);
   System.out.println("Length: "+lengt+" minutes");
  }
}
    