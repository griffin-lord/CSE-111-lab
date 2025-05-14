public class Dog extends Animal{
 public String type;
 public String co;
 
 public Dog(String nam,int ag, String col,String n2){
   super(nam,ag,col);
   type=n2;
   co=col;
 }
  public String info(){
    return super.info()+"Breed: "+type;
  }
  public void makeSound(){
  System.out.println(color+" color " +name+" Animal makes a sound");
  }
}