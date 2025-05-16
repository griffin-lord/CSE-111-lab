public class CinemexTicket extends MovieTicket {
    public static int cou;
    public String gen;
    public String type;
    public String ticID;
    public String time;
    public String date;
    public boolean pay;

    public CinemexTicket(String mov, String tim, String ge, String dat) {
        super(mov,dat,tim, 0);
        time=tim;
        date=dat;
        gen=ge;
        type = seatTypes[0];
        pay=false;
        cou++;
        generateTicketID();
    }
    public CinemexTicket(String mov, String time, String ge, String date, String ty) {
        super(mov,date,time, 0);
        gen=ge;
        type=ty;
        pay= false;
        cou++;
        generateTicketID();
    }

    public void generateTicketID() {
        ticID = getMovie() +"-" +cou;
    }

    public static int getTotalTickets() {
        return cou;
    }

    public void calculateTicketPrice() {
        int iny= 0;
        for (int i = 0; i < seatTypes.length; i++) {
            if (seatTypes[i]==type) {
                iny = i;
                break;
            }
        }
        double basePrice=seatPrices[iny];
        String[] timeParts = showtime.split(":");
        int hour = Integer.parseInt(timeParts[0]);
        if (hour >= 18 && hour <= 23) {
            basePrice += basePrice*(nightShowCharge/100.0);
        }
        setPrice(basePrice);
        System.out.println("Ticket price is calculated successfully.");
    }
    public String confirmPayment() {
        if(pay==true){
            return "Ticket price is already paid!";
        }
        pay= true;
        return "Payment Successful.";
    }

    public String toString() {
        return "Ticket ID: "+ticID+"\nMovie: "+getMovie()+"\nShowtime: " +time + "\nDate: " + date + "\nGenre: " + gen + "\nSeat Type: " +type + "\nPrice(tk): " + getPrice() + "\nStatus: " +"Paid" +pay;
    }
}