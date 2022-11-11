package JDBCStudentASSGN;

import java.sql.*;

public class JDBCExercise {
static Connection connection = null;
static String userName = "root";
static String dataBase = "";
static String Password = "Pass@1234";
static String Url = "jdbc:mysql://localhost:3306/studentDb";

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDb","root","Pass@1234");) {
			// PreparedStatement is ready to be called.. 
			//Prevents attacks 
			PreparedStatement ps = con.prepareStatement("INSERT INTO `studentDb`.`Student`(`StudentName`) VALUES('Joseph');");
			int Status = ps.executeUpdate();
			if(Status!=0) {
				System.out.println("Database Connection Established");
				System.out.println("Data Inserted Sucessfully!!!");
			}
			con.close();
		}catch (SQLException e) {
			
			e.printStackTrace();
			
		}
	}

}
