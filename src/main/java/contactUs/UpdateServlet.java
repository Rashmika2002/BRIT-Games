package contactUs;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//get updated details of booking
		String Bid = request.getParameter("bid");//cannot change value
		String Uname = request.getParameter("username");
		String Email = request.getParameter("email");
		String Reason = request.getParameter("reason");
		String Date = request.getParameter("date");
		
		boolean isTrue;
		
		isTrue = ContactUsDBUtil.updatebooking(Bid,Uname, Email, Reason, Date);//call update method
		
		if(isTrue ==true)
			{
				List<User> Udetails = ContactUsDBUtil.getAllBooking();
				request.setAttribute("Udetails",Udetails);
				
				RequestDispatcher dis = request.getRequestDispatcher("BookingDetails.jsp");//display booking details page with updated details
				dis.forward(request, response);
				
				
			}
		else{		
			List<User> Udetails = ContactUsDBUtil.getAllBooking();
			request.setAttribute("Udetails",Udetails);

			
			RequestDispatcher dis = request.getRequestDispatcher("BookingDetails.jsp");
			dis.forward(request, response);
		}
		
	}

}
