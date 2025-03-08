public class Reader {
  public String name;
  public int capa;
  public String[] bName;
  public int cou;

   public String createReader(String name, int capa) {
        this.name = name;
        this.capa = capa;
        this.bName = new String[capa];
        this.cou= 0;
        return "A new reader is created!";
    }

  public void readerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capa);
        System.out.println("Books:");
        if (cou== 0){
            System.out.println("No books added yet");
        } 
        else {
            for 
              (int i = 0; i <cou; i++) {
                System.out.println("Book " + (i + 1) + ": " + bName[i]);
            }
        }
    }
  public void addBook(String bookName) {
        if (cou<capa) {
            bName[cou] = bookName;
            cou++;
        } 
        else {
            System.out.println("No more capacity");
        }
    }
}

  