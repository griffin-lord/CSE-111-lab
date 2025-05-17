public class Car extends Vehicle{
  public String name;
  public String brand;
  public int door;
  public int wheel;
  public boolean ai;
  
  
  public Car(String nam,String mod,int ye, int doo, int whe, boolean a1){
    super(nam,ye);
    setWheels(whe);
    name=nam;
    wheel=whe;
    brand=mod;
    door=doo;
    ai=a1;
  }
  
  public void startAutoPilot(){
     if (ai==true) {
      System.out.println(getBrand()+":"+brand+" AutoPilot Started");
   } 
    else{
     System.out.println(getBrand()+":"+brand+" has NO AutoPilot");
    }
  }
  public String toString() {
    return "Car Brand: "+getBrand()+", Year: "+getYear()+", Wheels: "+getWheels()+
           ", Model: " +brand+ ", Doors: " +door+", AI: " +ai;
    }
}