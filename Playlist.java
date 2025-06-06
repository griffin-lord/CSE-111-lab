public class Playlist{
  public String plau;
  public Song start=null;
  public int cou=1;
  
  public Playlist(String cn){
    plau=cn;
    System.out.println(plau+" created. ");
  }
   
  public void info(){
    if (start!=null) {
    Song curs=start;
    System.out.println(plau+" has the following songs: ");
    while(curs!=null){
    System.out.println("Song- " + cou);
    curs.songInfo();
    curs=curs.next;
    cou++;
    }
   }
    else{
    System.out.println("No songs in "+plau+ ".");
    }
   }
  public void addSong(Song n1) {
   if (start!=null){
     Song curs= start;
     while (curs.next!=null) {
     curs=curs.next;
    }
     curs.next=n1;
   }
     else{
     start=n1;
     }
  System.out.println(n1.son + " added to " +plau);
}
  public void addSong(Song n2, int ds) {
   if (ds==0) {
    n2.next=start;
     start=n2;
     System.out.println(n2.son+ " added to "+plau);
     return;
    }
   Song cur=start;
   int cout=0;
   while(cur!=null && cout<ds - 1) {
     cur=cur.next;
       cout++;
    }
   if(cur!=null){
    n2.next=cur.next;
    cur.next= n2;
    System.out.println(n2.son+ " added to "+plau);
    } 
  else{
     System.out.println("Cannot add song to Index "+ds);
    }
  }

  public void playSong(String sa) {
   Song curss=start;
    while (curss!=null) {
    if (curss.son==sa){
     System.out.println("Playing "+curss.son+" by "+curss.art);
         return;
        }
        curss=curss.next;
    }
    System.out.println(sa+ " not found in " +plau);
}
  public void playSong(int inc) {
    Song curt=start;
    int coun= 0;
    while(curt!=null && coun< inc) {
        curt=curt.next;
        coun++;
    }
  if (curt==null) {
     System.out.println("Song at Index " +inc+" not found in "+plau);
    } 
 else {
     System.out.println("Playing "+curt.son+" by "+curt.art);
    }
  }
  public void deleteSong(String sn1){
   if (start==null){
   System.out.println("No songs in "+plau);
    return;
    }
  Song curr=start;
  Song prev=null;
   while (curr!=null) {
     if (curr.son == sn1){
     if (prev== null) {
      start = curr.next;
            } 
     else {
     prev.next = curr.next;
      }
     System.out.println(sn1+ " deleted from "+plau);
            return;
        }
        prev= curr;
        curr= curr.next;
    }
    System.out.println(sn1+ " not found in " +plau);
  }
  public int totalSong() {
    int cou=0;
    Song c=start;   
    while (c!=null) {
        cou++;
        c=c.next;
    }   
    return cou;
  }
    public void merge(Playlist ne) {
    if (ne.start==null) {
        System.out.println("No songs to merge from "+ne.plau);
        return;
    }
    if (start == null) {
        start=ne.start;
    } 
    else {
        Song cer= start;
        while(cer.next!= null){ 
            cer=cer.next;
        }
        cer.next =ne.start;
    }
    System.out.println("Merging Complete!");
   }
  }