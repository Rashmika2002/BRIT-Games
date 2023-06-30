package contactUs;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContactUsDBUtil {
	
	//create boolean,connection,statement and resultSet variables
	private static boolean IsSuccess;
	private static Connection con =null;
	private static Statement st = null;
	private static ResultSet res = null;
	
	//create insert function
	public static boolean InsertUser(String name,String email,String reason,String date)
	{
		IsSuccess = false;
		
		try {
			con = DBConnect.getConnection();//connect to DB
			
			st = con.createStatement();
			//create query
			String sql = "Insert into contact_us(UserName,Email,Reason,Date) values('"+name+"','"+email+"','"+reason+"','"+date+"')";
			
			int rs = st.executeUpdate(sql);//store value to rs		
			
			if(rs>0)
			{
				IsSuccess = true;
				
			}else 
			{
				IsSuccess = false;
			}
			
		}catch(Exception ex){
			
			ex.printStackTrace();
		}
		
		return IsSuccess;//return boolean value
		
	}
	//create getDetails function
	public static List<User> getUserDetails(String name)
	{
		
		ArrayList<User> Us = new ArrayList<>();
		
		try {
		 con = DBConnect.getConnection();//connect to DB
		 st = con.createStatement();
			
		 String sql = "Select * From contact_us where UserName='"+name+"'";
		 res = st.executeQuery(sql);
			
			while(res.next())
			{
				//assign retrieved values to variables
				int BID = res.getInt(1);
				String Uname=res.getString(2);
				String Email=res.getString(3);
				String Reason=res.getString(4);
				String Date = res.getString(5);
				
				User U = new User(BID,Uname,Email,Reason,Date);
				Us.add(U);//assign details to the array list
			}
			
			
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}
		
		
		return Us;//return array List
	}
	//create function of update a booking
	public static boolean updatebooking(String BID,String UNAME,String EMAIL,String REASON,String DATE)
	{
		try {
			con = DBConnect.getConnection();//connect DB
			st = con.createStatement();
			String sql = "update contact_us set UserName='"+UNAME+"',Email='"+EMAIL+"',Reason='"+REASON+"',Date='"+DATE+"' where bookingID='"+BID+"'";
			
			int rs = st.executeUpdate(sql);
			
			if(rs>0)
			{
				IsSuccess = true;
			}else {
				IsSuccess = false;
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return IsSuccess;//return boolean
		
	}
	//create delete function
	public static boolean DeleteBooking(String BID)
	{

		int convBID = Integer.parseInt(BID);//convert String to integer
		
		try {
			
			con = DBConnect.getConnection();//connect to DB
			st = con.createStatement();
			String sql = "delete from contact_us where bookingID='"+convBID+"'";//query
			
			int rs =st.executeUpdate(sql);
			
			if(rs>0) {
				IsSuccess = true;
			}else	
			{
				IsSuccess = false;
			}
			
		}
		catch (Exception Ex)
		{
			Ex.printStackTrace();
		}
		return IsSuccess;//return boolean value
	}
	
	//Retrieve single tuple in booking details
	public static boolean RetrieveBooking()
	{	
		try {
			con = DBConnect.getConnection();//connet DB
			st = con.createStatement();
			String sql = "Select * from contact_us";
			
			int rs =st.executeUpdate(sql);
			
			if(rs>0) {
				IsSuccess = true;
			}else	
			{
				IsSuccess = false;
			}
			
		}
		catch (Exception Ex)
		{
			Ex.printStackTrace();
		}
		return IsSuccess;//return boolean value
	}
	

	//create get all booking function
	public static List<User> getAllBooking()
	{
		
		ArrayList<User> Us = new ArrayList<>();
		
		try {
		 con = DBConnect.getConnection();
		 st = con.createStatement();
			
		 String sql = "Select * From contact_us ";//get all booking details
		 res = st.executeQuery(sql);
			
			while(res.next())
			{
				//assign retrieved values
				int BID = res.getInt(1);
				String Uname=res.getString(2);
				String Email=res.getString(3);
				String Reason=res.getString(4);
				String Date = res.getString(5);
				
				User U = new User(BID,Uname,Email,Reason,Date);//user object
				Us.add(U);//add details to array list
			}
			
			
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}
		return Us;//return Array List
	}
}
