public class Usis{
  public int totalAdvisee=0;
  public String[] subs= new String[4];
  public String name=" ";
  public String dep=" ";
  public int iDd=0;
   
  public Usis(){
    System.out.println("Usis is ready to use!");
  }
  
  public void login(Student n1){
    if(n1.emAil == null && n1.iD==0){
     System.out.println("Email and password need to be set.");
  }
    else{
     System.out.println("Login successful"); 
    }
  }
  
  public void advising(Student n2){
    if(n2.emAil == null && n2.iD ==0){
      System.out.println("Please login to advise courses!");
    }
    else{
     System.out.println("You haven't selected any courses.");   
   }
  }
  
    public void advising(Student n3,String s0,String s1,String s2,String s3){
      name=n3.nam;
      dep=n3.course;
      iDd=n3.iD;
      System.out.println("You need special approval to take more than 3 courses.");
    }
    
     public void advising(Student n4,String r0,String r1,String r2){
         subs[0]= r0;
         subs[1]= r1;
         subs[2]= r2;
         totalAdvisee++;
       System.out.println("Advising successful!");
     }
     
     public void allAdviseeInfo(){
       System.out.println("Name: "+name+"   ID"+iDd);
       System.out.println("Department: "+dep);
       System.out.println("Advised Courses:");
        for(int i=0; i<subs.length;i++){
         System.out.println(subs[i]); 
       }
   }
}