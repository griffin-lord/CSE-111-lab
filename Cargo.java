public class Cargo{
  public String nam;
  public static double capa;
  public static double cap;
  public static int id;
  public static int carg=1;
  public boolean sw=false;
 
  public Cargo(String bh,double n2){
    nam=bh;
    capa=n2;
    id+=1;
  }
  public double capacity(){
    cap=10.0;
    capa+=cap;
    return capa;
  }
  public void details(){
  System.out.println("Cargo ID: "+id+", Contents: "+nam);
  System.out.println("Weight: "+capa+" Loaded: "+sw);
}
  public void load(){
    if(capa == 0){
     System.out.println("Cargo Capacity: "+cap);
    }
    if(capa <= 10.0){
     System.out.println("Cannot load cargo, exceeds weight capacity.");  
    }
    if(capa>10.0){
      System.out.println("Cargo Capacity: "+cap);
    }
    System.out.println("Cargo "+carg+ "loaded for transport.");
    carg++;
  }
}