//Java DataBase Connectivity


/*
 * Steps:-
 * 1)import the package-->java.sql
 * 2)Load and register the driver-->com.mysql.jdbc.Driver
 * 3)Establish the connection
 * 4)create the statement
 * 5)Execute the Query
 * 6)Process result
 * 7)close 
 */
import java.sql.*;

public class jdbc {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/Employee";
		String uname="root";
		String pass="Shu@8299";
		String query="SELECT * FROM DEPARTMENT WHERE Deptno=1";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uname,pass);
			Statement st= con.createStatement();
			ResultSet rs=st.executeQuery(query);
			rs.next();
			String Dname=rs.getString("Dname");
			String Location=rs.getString("Location");
			
			System.out.println(Dname);
			System.out.println(Location);
			
			st.close();
			con.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
