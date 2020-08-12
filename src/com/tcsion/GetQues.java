

package com.tcsion;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddQuestion
 */
@WebServlet("/GetQues.do")
public class GetQues extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetQues() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("questype").equals("mcq"))
		{
		RequestDispatcher next = request.getRequestDispatcher("quesmcq.jsp");
		next.forward(request, response);
		}
		else if(request.getParameter("questype").equals("tf"))
		{
			RequestDispatcher next = request.getRequestDispatcher("questf.jsp");
			next.forward(request, response);
		}
			
	}

}
