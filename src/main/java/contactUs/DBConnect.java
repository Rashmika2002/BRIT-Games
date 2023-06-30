package contactUs;
//db connection class
import java.sql.*;

public class DBConnect {//DB connecting class

	//create variables and assign values for DB connection
	public static String url = "jdbc:mysql://localhost:3306/ogs";
	public static String Uname = "root";//username
	public static String pass = "19718";//password
	private static Connection con;
	
	public static Connection getConnection()//connection method
	{
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,Uname,pass);//connect using driverManager
			
			
		}catch(Exception ex)
		{
			System.out.println("DB not connected!");//print message
		}
		
		return con;
	}
		
}
