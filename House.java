public class House{
  public int window;
  public int door;
  
  
    public void increaseDoor(int dr){
      door =door+dr;
    }
  public void view(){
    System.out.println(window+"windows");
    System.out.println(door+"door");
  }
  }