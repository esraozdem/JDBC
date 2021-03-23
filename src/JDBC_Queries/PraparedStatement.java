package JDBC_Queries;

import java.awt.DisplayMode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PraparedStatement {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
	
		String url = "jdbc:mysql://127.0.0.1:3306/ebookshop";
	    String username = "root";
		String password = "Erolbirol12&";
		
		try {
			// 1.Get a connection to database 
			connection = DriverManager.getConnection(url, username,password);
			
			//2.prepare statement
			preparedStatement = connection.prepareStatement("select * from books where qty > ? and author = ?");
			
			//3. Set parameters
			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "Kevin Jones");
			
			//4. execute SQL query
			resultSet = preparedStatement.executeQuery();
			
			//System.out.println(resultSet);
			
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
