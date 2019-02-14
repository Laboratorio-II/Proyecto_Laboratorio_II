package controladores;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.dto.Users;
import modelos.servicio.ServicioUsers;

@WebServlet("/ControladorProfile2")
public class ControladorProfile2 extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
private ServicioUsers servicioUsers;
	
	public ControladorProfile2() {
		super();
		this.servicioUsers = ServicioUsers.getInstancia();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.getRequestDispatcher("vistas/PerfilEmpresa.ftl").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String email = request.getParameter("emailEmpresa");
		String pass = request.getParameter("passEmpresa");
		//String rpass = request.getParameter("repEmpresa");
		
		
		Users user = new Users(email, pass, 3, 'A');
		this.servicioUsers.incluirUsers(user);
		
		request.setAttribute("user", user);
			
		doGet(request, response);
	}
}