package controladores;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		
		if(request.getParameter("user").equals(null)){
			
			//HttpSession misession= (HttpSession) request.getSession();
			 
			//Users sessionUser= (Users) misession.getAttribute("sessionUser");
			
			//String user = sessionUser.getEmail();
			//request.setAttribute("user", user);
		}else{
			String user = request.getParameter("user");
			request.setAttribute("user", user);
		}
		
		Users users = this.servicioUsers.getUserPorField("email", "hermes@gmail.com");
		request.setAttribute("users", users);
		
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
			
			request.setAttribute("user", email);
			
			
			HttpSession misession= request.getSession(true);
			Users sessionUser= new Users(email, pass, 2, 'A');
			misession.setAttribute("sessionUser",sessionUser);
			
			//doGet(request, response);
			request.getRequestDispatcher("vistas/profile.ftl").forward(request, response);
		//}
	}
	
}