import java.util.Scanner;

public class Bus_Main {
    public static void main(String[] args) throws Exception {
        Bus_table bs = new Bus_table();
        Scanner sc = new Scanner(System.in);
        int option = 1;

        while (option != 4) {
        	bs.Display_bus_table();
            System.out.println("\nEnter 1 to Book\nEnter 2 to Update Booking\nEnter 3 to Delete Booking\nEnter 4 to Exit");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    Booking b = new Booking();
                    if (b.isAvailable()) {
                        Booking_table bt = new Booking_table();
                        bt.addBookingTable(b);
                        System.out.println("Your booking is confirmed.");
                    } else {
                        System.out.println("Sorry. Bus is full. Try another bus or date.");
                    }
                    break;

                case 2:
                    sc.nextLine(); 
                    System.out.print("Enter current passenger name: ");
                    String oldName = sc.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    Booking_table bt1 = new Booking_table();
                    bt1.updateBooking(oldName, newName);
                    break;

                case 3:
                    sc.nextLine(); 
                    System.out.print("Enter passenger name to delete booking: ");
                    String delName = sc.nextLine();
                    Booking_table bt2 = new Booking_table();
                    bt2.deleteBooking(delName);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
