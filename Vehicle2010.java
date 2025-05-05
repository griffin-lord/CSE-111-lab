public class Vehicle2010 extends Vehicle {
  
 public Vehicle2010(){
  this.x = 0;
  this.y = 0;
}
 public void moveLowerLeft(){
   moveLeft();
   moveDown();
 }
 public void moveUpperRight(){ 
  moveRight();
  moveUp();
}
 public void moveLowerRight(){
  moveRight();
  moveDown();
 }
 public void moveUpperLeft(){
   moveLeft();
   moveUp();
 }
}