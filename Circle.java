public class Circle extends Shape {
    public int radius;
    public double area;
    
    public void area(){
      area=Math.PI*radius*radius;
      System.out.println("Area: "+area);
    }
    
}
