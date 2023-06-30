package contactUs;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RetrieveServlet")
public class RetrieveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		boolean isTrue;//boolean variable
		
		isTrue=ContactUsDBUtil.RetrieveBooking();//retrieve details from method
		
		if(isTrue==true)
		{
			
			List<User> Udetails = ContactUsDBUtil.getAllBooking();
			request.setAttribute("Udetails",Udetails);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("BookingDetails.jsp");//link to booking all details page
			dis.forward(request, response);
			
		}
		else
		{
			
			List<User> Udetails = ContactUsDBUtil.getAllBooking();
			request.setAttribute("Udetails",Udetails);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("BookingDetails.jsp");
			dis.forward(request, response);
		}
		
		doGet(request, response);
	}

}
