/*2. Write a java program that connects to oracle database, 
 *   queries the inbuilt table “EMPLOYEE” and displays 
 *   the first two columns (Empno using column index and Ename using column name ) of all the rows.
 */
import java.sql.*;
public class jdbc_2 {

	public static void main(String[] args) throws Exception{
		try {
			String url="jdbc:mysql://localhost:3306/Employee";
			String uname="root";
			String pass="Shu@8299";
			String query="Select * from EMPLOYEE WHERE Empno=1 or Empno=2";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uname,pass);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString("Ename"));
			}
			
			st.close();
			con.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
