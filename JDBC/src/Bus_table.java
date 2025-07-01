import java.sql.*;

public class Bus_table {

	public void Display_bus_table() throws Exception {
		String query = "Select * from bus";
		Connection con = DB_Connection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Bus No: " + rs.getInt(1));
			if(rs.getInt(2)==0)
				System.out.println("AC: no ");
			else
				System.out.println("AC: yes ");
			System.out.println("Capacity: " + rs.getInt(3));
		}
		
		System.out.println("------------------------------------------");
	}
	
	public int getCapacity(int id) throws Exception {
		String query = "Select capacity from bus where id=" + id;
		Connection con = DB_Connection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
	}

}
