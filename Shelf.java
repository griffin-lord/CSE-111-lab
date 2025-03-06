public class Shelf {
   public int capacity;
   public int boo;
    public void showDetails() {
        System.out.println("Shelf capacity: " + capacity);
        System.out.println("Number of books: " + boo);
    }
    public void addBooks(int m) {
        if (capacity == 0) {
            System.out.println("Zero capacity. Cannot add books.");
        } 
        else if (boo+m<=capacity) {
            boo+=m;
            System.out.println(m+" books added to shelf");
        } 
        else {
            System.out.println("Exceeds capacity");
        }
    }
}

       
     