import java.util.*;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of passenger: ");
		passengerName = scanner.nextLine();
		System.out.println("Enter bus no: ");
		busNo = scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
	public boolean isAvailable() throws Exception
	{
		
		Bus_table bt = new Bus_table();
		Booking_table b = new Booking_table();
		int capacity = bt.getCapacity(busNo);

		int booked = b.getBookedCount(busNo,date);
		
		return booked<capacity;
	}

}
