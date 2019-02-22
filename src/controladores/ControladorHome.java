package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.servicio.ServicioUsers;

@WebServlet("/ControladorHome")
public class ControladorHome extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ServicioUsers servicioUsers;
	
	public ControladorHome() {
		super();
		this.servicioUsers = ServicioUsers.getInstancia();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		request.setAttribute("usersList", this.servicioUsers.getUsers());
		request.getRequestDispatcher("vistas/tests/prueba.ftl").forward(request, response);
		//request.getRequestDispatcher("vistas/empresas.ftl").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}