package JDBCStudentASSGN;

import java.sql.*;

public class JDBCExercise2Prepared {
static Connection connection = null;
static String userName = "root";
static String dataBase = "";
static String Password = "Pass@1234";
static String Url = "jdbc:mysql://localhost:3306/studentDb";

	public static void main(String[] args) {
		
		//register driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		//  ask SQL Connection from Driver Manager class, providing connction url,username,password
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDb","root","Pass@1234");) {
			// PreparedStatement is ready to be called.. 
			//Prevents attacks 
			//get statement object from Connection
			Statement st = con.createStatement();
			
			ResultSet r = st.executeQuery("Select StudentID,StudentName from studentDb.student");
			while(r.next()) {
				int ID = r.getInt(1);
				String Name = r.getString(2);
				 System.out.println("id="+ID+", name="+Name);
			}
			
			con.close();
			r.close();
			st.close();
		}catch (SQLException e) {
			
			e.printStackTrace();
			
		}
	}

}
