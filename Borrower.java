public class Borrower{ 
  public String name;
  public String book;
  public int cou;
  public static int reman;
  public static int book_count[] = {3, 3, 3}; 
  public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"}; 
 
  public Borrower(String n1){
    name=n1;
    
  }
  public void borrowBook(String t1){
    book=t1;
      if(book == "Pather Panchali"){
        book_count[0]-=1;
        cou++;
    }
      if(book == "Durgesh Nandini"){
        book_count[1]-=1;
        cou++; 
      }
       if(book == "Anandmath"){
        book_count[2]-=1;
        cou++;
      }
  }
  
  public void borrowerDetails(){
    System.out.println("Name: "+name);
    System.out.println("Books Borrowed: ");
    for(int i=0;i<cou;i++){
      System.out.println(book_name[i]);
    }
  }
  public static int remainingBooks(String c2){
   return  book_count[2];
  }
  
  public static void bookStatus(){
    System.out.println("Available Books: ");
     for(int i=0; i<book_count.length; i++){
      System.out.println(book_name[i]+": "+book_count[i]);
    }
  }
} 