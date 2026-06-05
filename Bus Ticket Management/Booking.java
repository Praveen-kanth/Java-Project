import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
    String passengerName;
    int busNo;
    Date date;
    Booking() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        passengerName = sc.next();

        System.out.println("Enter Bus No: ");
        busNo=sc.nextInt();

        System.out.println("Enter date [dd-mm-yyyy]: ");
        String dateInuput = sc.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInuput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public Boolean isAvailable(ArrayList<Booking>bookings, ArrayList<Bus>buses){  //reference only passing
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getbusNo()==busNo) {
                capacity=bus.getcapacity();
            }
        }
        int booked =0;
        for (Booking b : bookings) {
            if (b.busNo == busNo && b.date.equals(date)) {
               booked++; 
            }
        }
        return booked<capacity?true:false;
    }
    
}
//date=sc.nextInt();
//store as String and convert to date
//want to use simpledateformat class - to create obj