package contactUs;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get bookingId value for delete
		String Bid = request.getParameter("bid");//booking ID
		
		boolean Istrue;
		
		Istrue = ContactUsDBUtil.DeleteBooking(Bid);//call delete method 
		
		if(Istrue==true)
		{
			
			List<User> Udetails = ContactUsDBUtil.getAllBooking();
			request.setAttribute("Udetails",Udetails);

			RequestDispatcher dis = request.getRequestDispatcher("ContactUs.jsp");//link to BookingForm page
			dis.forward(request, response);
			
		}
		else
		{
			
			List<User> Udetails = ContactUsDBUtil.getAllBooking();
			request.setAttribute("Udetails",Udetails);

			
			RequestDispatcher dis = request.getRequestDispatcher("ContactUs.jsp");
			dis.forward(request, response);
		}
		
		
	}

}
