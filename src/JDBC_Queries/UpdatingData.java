package JDBC_Queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class UpdatingData {

	public static void main(String[] args) {
		
		
		
		String url = "jdbc:mysql://127.0.0.1:3306/ebookshop";
	    String username = "root";
		String password = "Erolbirol12&";
		
		try {
			
			Connection connection = DriverManager.getConnection(url,username, password);
			
			Statement statement = connection.createStatement();
			
			String sql = "update books"
					+ " set qty = 4 "
					+ "where id = 6";
			
			statement.executeUpdate(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		


	}

}
