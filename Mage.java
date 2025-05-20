public class Mage extends Character{
  public String name;
  public Mage(String nam,int s1){
    super(nam,s1);
    name=nam;
  }
    public void specialMove(){
    System.out.println(name+" performs a heavy sword slash!");
  }
}