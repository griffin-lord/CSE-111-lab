public class Library{
  public String bo;                                                          
  public int cou;
  public  String[] books;
  int cap=0;
  public void setBookCapacity(int n){
    this.cap+=n;
    books=new String[n];
  }
  public void addBook(String bo){
     if(cou<cap){
     books[cou] = bo;
       System.out.println("Book "+bo+" added to the library");
       cou++;
    }
      else {
      System.out.println("Exceeds maximum capacity. You can't add more than "+cap+" books");
      }
  }
  public void printDetail(){
    System.out.println("Maximum Capacity: "+cap);
    System.out.println("Total Books: "+cou);
    System.out.println("Book list: ");
    for (int i = 0;i<cou; i++) {
            System.out.println(books[i]);
        }
    }
}