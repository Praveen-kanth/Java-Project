import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public static void main(String[] args) {
        ArrayList <Bus> buses = new ArrayList<Bus>();
        ArrayList <Booking> bookings = new ArrayList<Booking>();

        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, false, 45));
        buses.add(new Bus(3, true, 45));
        buses.add(new Bus(4, false, 45));
        buses.add(new Bus(5, true, 45));

        for (Bus b : buses) {
            b.displayBusInfo();
        }

        int useropt = 1;
        Scanner sc = new Scanner(System.in);
        while (useropt == 1) {
            System.out.println("Enter 1 -> Booking and Enter 2 -> Exit");
            useropt = sc.nextInt();
            if (useropt==1) {
                Booking booking = new Booking();
                if (booking.isAvailable(bookings,buses)) {
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                }
                else {
                    System.out.println("Bus is full, Try another bus or date");
                }
            }
        }
        
    }
}
//Bus b1 = new Bus() - separate obj not efficient
//Bus buses [] = new Bus[50]; - not efficient

//get method -> accessor method
//set method -> mutator method