public class ComplexNumber extends RealNumber{
 public double img;
 
 public ComplexNumber() {
   super(1.0);
   this.img = 1.0;
  }
 public ComplexNumber(double t2, double t1) {
   super(t2);
   this.img=t1;
    }
  public String toString() {
        return super.toString() + "\nImaginaryPart: " +img;
    }
}
  