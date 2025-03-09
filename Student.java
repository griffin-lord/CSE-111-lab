public class Student{
  public String name;
  public String prog;
  
  public Student(String nam,String pro){
    name=nam;
    prog=pro;
  }
  
  public void updateName(String na){
    name=na;
  }
  
  public void updateProgram(String c){
    prog=c;
  }
  
  public String accessProgram(){
    return prog;
  }
}
  