public class Manager extends Employee{
    public double bas;
     public int wor;
     public double bonus;
     
 public Manager(String nam,double base,int work,double bon){
    super(nam,base,work);
    setBaseSalary(base);
    setHoursWorked(work);
    bas=base;
    wor=work;
    bonus=bon;
  }
 
  public void calculateSalary(){
  if (getHoursWorked()>40) {
     bonus = getBaseSalary()*(bonus/100);
        setBaseSalary(getBaseSalary()+bonus);
       }
  }
    public void requestIncrement(double inc) {
      if (getHoursWorked()>100) {
         setBaseSalary(getBaseSalary()+inc);
         System.out.println("$" +inc+ " Increment approved.");
        } 
      else if (getHoursWorked()>80) {
          setBaseSalary(getBaseSalary() +inc/ 2);
          System.out.println("$" + (inc/2) + " Increment approved.");
        } 
      else {
          System.out.println("Increment denied.");
       }
    }
    public void displayInfo(){
      super.displayInfo();
      System.out.println("Bonus: " + bonus + " %");
      System.out.println("Final Salary: $" + getBaseSalary());
    }
  }
