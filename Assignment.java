public class  Assignment{
 public int tasks;
 public String difficulty;
 public boolean submission;
 public String makeOptional(){
   String sq="Assignment will not require submission";
   return sq;
 }
 public void printDetails(){
   System.out.println("Number of tasks: "+tasks);
   System.out.println("Difficulty level: "+difficulty);
   System.out.println("Submission required: "+submission);
 }
}