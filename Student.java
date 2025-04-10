public class Student {
    public String emAil = null;
    public String pasS = null;
    public String logstat = null;
    public String nam = " ";
    public String course = " ";
    public int iD = 0; 

    public Student(String n1, int id, String cou) {
        nam = n1;
        iD = id;
        course = cou;
        System.out.println("Student object is created");
    }
    
    public void email(String email) {
       emAil = email;
    }

    public void password(String password) {
        pasS = password;
    }
}
