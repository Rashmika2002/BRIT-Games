package contactUs;

public class User {

	private int BId;
	private String Username;
	private String Email;
	private String Reason;
	private String Date;
	
	public User()//default constructor
	{
		
	}
	//constructor
	public User(int Bid,String uName,String email,String reason,String date)
	{
		this.BId=Bid;
		this.Date=date;
		this.Email=email;
		this.Reason=reason;
		this.Username=uName;
		
	}
	//create getters for parameters
	public int getBId() {
		return BId;
	}

	public String getUsername() {
		return Username;
	}

	public String getEmail() {
		return Email;
	}

	public String getReason() {
		return Reason;
	}

	public String getDate() {
		return Date;
	}
	

}
