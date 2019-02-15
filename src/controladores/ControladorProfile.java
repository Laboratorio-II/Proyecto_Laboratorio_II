package controladores;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.dto.Users;
import modelos.servicio.ServicioUsers;

@WebServlet("/ControladorProfile")
public class ControladorProfile extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ServicioUsers servicioUsers;
	
	public ControladorProfile() {
		super();
		this.servicioUsers = ServicioUsers.getInstancia();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String user = request.getParameter("user");
		request.setAttribute("user", user);
		
		request.getRequestDispatcher("vistas/profile.ftl").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String email = request.getParameter("emailProfesional");
		String pass = request.getParameter("passProfesional");
		//String rpass = request.getParameter("repProfesional");
		
		
		//if(pass == rpass){
			Users user = new Users(email, pass, 2, 'A');
			this.servicioUsers.incluirUsers(user);
			
			request.setAttribute("user", user);
			
			doGet(request, response);
		//}
	}
}