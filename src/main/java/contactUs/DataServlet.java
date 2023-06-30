package contactUs;

import java.util.List;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//servlet class of getting bookingForm data
@WebServlet("/DataServlet")
public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get input data
		
		//(BID auto increment)
		String userName = request.getParameter("username");
		String Email = request.getParameter("email");
		String Reason = request.getParameter("reason");
		String date = request.getParameter("date");
		
		boolean returnValue;//boolean variable
		
			returnValue = ContactUsDBUtil.InsertUser(userName,Email,Reason,date);//insert form data
		
		if(returnValue==true)
		{
			List<User> Udetails = ContactUsDBUtil.getAllBooking();//retrieve list
			request.setAttribute("Udetails",Udetails);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("BookingDetails.jsp");//link to booking details page
			dis.forward(request, response);
			
		
		}
		else
		{
			List<User> Udetails = ContactUsDBUtil.getAllBooking();//retrieve list
			request.setAttribute("Udetails",Udetails);
			
			RequestDispatcher dis2 = request.getRequestDispatcher("Unsuccess.jsp");//display unsuccess message
			dis2.forward(request, response);
		}
		
}
	

}


