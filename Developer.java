public class Developer extends Employee {
 public String lang;

 public Developer(String nam,double base,int wor,String la) {
       super(nam,base,wor);
        lang=la;
    }
  public void calculateSalary() {
     if (lang=="Java") {
    setBaseSalary(getBaseSalary()+700);
    }
  }
 public void displayInfo(){
      super.displayInfo();
      System.out.println("Final Salary: $" + getBaseSalary());
    }
}
