public class BracuStudent{
  public String nam;
  public String hom;
  public boolean c2=false;
  
  public BracuStudent(String c1, String c2){
    nam=c1;
    hom=c2;
  }
  public void showDetails(){
    System.out.println("Student Name: "+nam);
    System.out.println("Lives in "+hom);
    System.out.println("Have Bus Pass? "+c2);
  }
    public void getPass(){
      c2=true;
    }
    public void updateHome(String hg){
     hom=hg;
    }
}