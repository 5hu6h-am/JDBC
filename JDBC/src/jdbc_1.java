/*1. Write a java program that establishes a connection 
 *   to oracle database successfully. If the connection is successful, 
 *   it should display a message “Connection Established successfully”.
 *   In case, it is not able to do so due to any exception, it should display the message “Connection could  not be established “. If there is an exception, it should also display the description of the exception.
 */

import java.sql.*;
public class jdbc_1 {
	public static void main(String[] args) throws Exception{
		Connection con=null;
		try {
			String url="jdbc:mysql://localhost:3306/Employee";
			String uname="root";
			String pass="Shu@8299";
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,uname,pass);
			System.out.println("Connection Established successfully");
		}catch(Exception e) {
			System.out.println("Connection could  not be established");
		}
		finally {
			if(con!=null) con.close();
		}
	}

}
