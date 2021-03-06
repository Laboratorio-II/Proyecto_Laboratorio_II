package controladores;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controladores.utils.Utils;
import modelos.servicio.ServicioUsers;

@WebServlet("/ControladorProfesionales")
public class ControladorProfesionales extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ServicioUsers servicioUsers;
	
	public ControladorProfesionales() {
		super();
		this.servicioUsers = ServicioUsers.getInstancia();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("usersList", this.servicioUsers.getUsers());
		request.getRequestDispatcher("vistas/admin/profesionales.ftl").forward(request, response);		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	}
	
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String> parametros = Utils.getParameterMap(request);
		Integer id = Integer.parseInt(parametros.get("id"));
		//String id = request.getParameter("id");
		//request.setAttribute("id", id);
		response.getWriter().print(this.servicioUsers.eliminarUser(id));
		//request.getRequestDispatcher("vistas/login.ftl").forward(request, response);
	}
}