package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class clients
 */
@WebServlet("/clients")
public class clients extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clients() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 clientss Clients = new clientss();
		 Clients.setNom("Sheyma");
		 Clients.setPrenom("bellayouni");
		 Clients.setTelephone("21212152");
		 Clients.setVille("monastir");
		 Clients.setProduits("msi");
		  request.setAttribute("Clients", Clients);
		
		
		
		response.getWriter().append( "Served at: " ).append(request.getContextPath());
		this.getServletContext().getRequestDispatcher( "/WEB-INF/clients.jsp" ).forward( request, response ); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
