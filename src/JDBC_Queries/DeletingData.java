package JDBC_Queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeletingData {

	public static void main(String[] args) {
		
		
		
		
		String url = "jdbc:mysql://127.0.0.1:3306/ebookshop";
	    String username = "root";
		String password = "Erolbirol12&";
		
		
		try {
			
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			
			String sql = "delete from books where qty = 4";
			int rowsAffected = statement.executeUpdate(sql);
			System.out.println("Rows affected: " + rowsAffected);
			System.out.println("Delete complete.");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		

	}

}
