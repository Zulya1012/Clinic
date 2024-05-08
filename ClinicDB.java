package plk;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ClinicDB {

	

		public void Save(Clinic c) throws SQLException, ClassNotFoundException {
			
			String sql = String.format("INSERT INTO Clinic (number, address)" + "VALUES ( '%d', '%s')", c.getNumber(), c.getAddress());
			System.out.println(sql);
			int rowsInserted = connectionDB().executeUpdate(sql);
			System.out.println(rowsInserted);
			
		}
		public void SaveDoctor(Doctor d) throws ClassNotFoundException, SQLException {
			String sql = String.format("INSERT INTO Doctor (name, lastName, numberDistrict)" + "VALUES ( '%s', '%s, '%d')", d.getName(), d.getLastName(), d.getNumberDistrict());
			System.out.println(sql);
			int rowsInserted = connectionDB().executeUpdate(sql);
			System.out.println(rowsInserted);
		}
		
	   public void SavePasient(Pasient p) throws ClassNotFoundException, SQLException {
		   String sql = String.format("INSERT INTO Pasient (name, lastName, address, phoneNumber, districtDoctor)" + "VALUES ( '%s', '%s, '%s', '%s', '%s')", p.getName(), p.getLastName(), p.getAddress(), p.getPhoneNumber(), p.getDistrictDoctor());
			System.out.println(sql);
			int rowsInserted = connectionDB().executeUpdate(sql);
			System.out.println(rowsInserted);
	   }
	   
		public Statement connectionDB() throws SQLException, ClassNotFoundException {
			Class.forName ("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection ("jdbc:sqlite:C:\\DB\\database.db");
			System.out.println("Connected to SQLite database");
			System.out.println("Connected to SQLite has been established");
			Statement stm = conn.createStatement();
			return stm;
		}
			


}
