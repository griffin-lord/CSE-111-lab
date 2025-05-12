public class Paladin extends Warrior{
  public String name;
 
  public Paladin(String nam,int s1){
    super(nam,s1);
    name=nam;
  }
  
  public void specialMove(){
    System.out.println(name+" unleashes a holy strike!");
  }
}