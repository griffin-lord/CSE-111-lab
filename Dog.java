public class Dog extends Animal{
  public String nam;
  public int ag;
  public String clr;
  public String type;
  
  public Dog(String nm,int ag,String c3,String c4){
    super(nm,ag,c4);
    clr=c3;
    nam=nm;
  }
  public void makeSound(){
    System.out.println(clr+" color "+nam+" is barking");
  }
}
  