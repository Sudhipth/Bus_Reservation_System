import java.sql.*;
import java.util.Date;

public class Booking_table {

    public int getBookedCount(int busNo, Date date) throws Exception {
        String query = "select count(passenger_name) from booking where bus_no=? and travel_date=?";
        Connection con = DB_Connection.getConnection();
        PreparedStatement pst = con.prepareStatement(query);
        java.sql.Date sqldate = new java.sql.Date(date.getTime());
        pst.setInt(1, busNo);
        pst.setDate(2, sqldate);
        ResultSet rs = pst.executeQuery();
        rs.next();
        return rs.getInt(1);
    }

    public void addBookingTable(Booking b) throws Exception {
        String query = "Insert into booking values(?,?,?)";
        Connection con = DB_Connection.getConnection();
        java.sql.Date sqldate = new java.sql.Date(b.date.getTime());
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, b.passengerName);
        pst.setInt(2, b.busNo);
        pst.setDate(3, sqldate);
        pst.executeUpdate();
        reduceBusCapacity(b.busNo);
    }

    public void updateBooking(String oldName, String newName) throws Exception {
        String query = "UPDATE booking SET passenger_name=? WHERE passenger_name=?";
        Connection con = DB_Connection.getConnection();
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, newName);
        pst.setString(2, oldName);
        int rows = pst.executeUpdate();
        if (rows > 0) {
            System.out.println("Booking updated successfully.");
        } else {
            System.out.println("No booking found for the name: " + oldName);
        }
    }

    public void deleteBooking(String passengerName) throws Exception {
        String query = "DELETE FROM booking WHERE passenger_name=?";
        Connection con = DB_Connection.getConnection();
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, passengerName);
        int rows = pst.executeUpdate();
        if (rows > 0) {
            System.out.println("Booking deleted successfully.");
        } else {
            System.out.println("No booking found for the name: " + passengerName);
        }
        
    }
    public void reduceBusCapacity(int busNo) throws Exception {
        String updateQuery = "UPDATE bus SET capacity = capacity - 1 WHERE id = ?";
        Connection con = DB_Connection.getConnection();
        PreparedStatement pst = con.prepareStatement(updateQuery);
        pst.setInt(1, busNo);
        pst.executeUpdate();
    }
}
