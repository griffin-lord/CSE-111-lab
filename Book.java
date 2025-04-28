public class Book extends Product{
 public String publi;
 
  public Book(int id,String titl, int pr, String num, String c4){
    super(id,titl,pr);
    publi=c4;
  }
    
    public String printDetail(){
      return getIdTitlePrice()+"\nPublisher: "+publi;
    }
  }