package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class accueil
 */
@WebServlet("/accueil")
public class accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public accueil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String paramCategory = request.getParameter("category");
		String message ="";
		if (paramCategory != null) {
		message = paramCategory;
		}
		request. setAttribute ("category", message);
		
		String paramCategoryl = request.getParameter ( "Local" );
		String message1="";
		if (paramCategoryl !=null) {
		message1 = paramCategoryl;
		}
		request. setAttribute("Local", message1);
		String paramCategory2 = request. getParameter ( "Pc" );
		String message2 ="";
		if(paramCategory2 != null) {
		message2 = paramCategory2;
		}
		request.setAttribute("Pc", message2);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		this.getServletContext().getRequestDispatcher( "/WEB-INF/Accueil.jsp" ).forward( request, response ); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
