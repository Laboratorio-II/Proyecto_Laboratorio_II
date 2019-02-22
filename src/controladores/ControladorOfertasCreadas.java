package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.dto.Users;
import modelos.servicio.ServicioOferta;
import modelos.servicio.ServicioUsers;

@WebServlet("/ControladorOfertasCreadas")
public class ControladorOfertasCreadas extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private ServicioUsers servicioUsers;
	private ServicioOferta servicioOferta;
	
	public ControladorOfertasCreadas(){
		super();
		this.servicioUsers = ServicioUsers.getInstancia();
		this.servicioOferta = ServicioOferta.getInstancia();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String user = request.getParameter("user");
		Users myuser = this.servicioUsers.getUserPorId(Integer.parseInt(user));
		
		request.setAttribute("ofertas", this.servicioOferta.getOfertasPorField("idempresa", myuser.getId()));
		request.getRequestDispatcher("vistas/OfertasCreadasEmpresas.ftl").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	

}
