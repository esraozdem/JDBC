package JDBC_Queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertingData {

	public static void main(String[] args) {
		
		
		
		String url = "jdbc:mysql://127.0.0.1:3306/ebookshop";
	    String username = "root";
		String password = "Erolbirol12&";
		
		
		try {
			
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			
			// Execute SQL query
			String sql = "insert into books"
					+ "(id, title, author, price, qty)"
					+"values(6, 'To Kill A MockingBird', 'Herper Lee', 5, 1)";
			
			statement.executeUpdate(sql);
			
			System.out.println("Insert complete.");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			
		}

	}

}
