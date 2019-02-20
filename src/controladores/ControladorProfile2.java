package controladores;


import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import modelos.dto.Empresa;
import modelos.dto.PersonaEmpresa;
import modelos.dto.Users;
import modelos.servicio.ServicioEmpresa;
import modelos.servicio.ServicioPersonaEmpresa;
import modelos.servicio.ServicioUsers;

@WebServlet("/ControladorProfile2")
public class ControladorProfile2 extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ServicioUsers servicioUsers;
	private ServicioEmpresa servicioEmpresa;
	private ServicioPersonaEmpresa servicioPersonaEmpresa;
	
	public ControladorProfile2() {
		super();
		this.servicioUsers = ServicioUsers.getInstancia();
		this.servicioEmpresa = ServicioEmpresa.getInstancia();
		this.servicioPersonaEmpresa = ServicioPersonaEmpresa.getInstancia();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String user = request.getParameter("user");
		
		Users myuser = this.servicioUsers.getUserPorId(Integer.parseInt(user));
		
		request.setAttribute("user", myuser);
		request.setAttribute("datosempresa", this.servicioEmpresa.getEmpresaPorField("usuario", myuser.getId()));
		request.setAttribute("personaacargo", this.servicioPersonaEmpresa.getPersonaEmpresaPorField("usuario", myuser.getId()));
		
		request.getRequestDispatcher("vistas/PerfilEmpresa.ftl").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if(request.getParameter("operacion").equals("registrarEmpresa")){
			registrarEmpresa(request, response);
		}else if(request.getParameter("operacion").equals("guardarDatosLaboralesEmpresa")){
			try {
				modificarDatosEmpresa(request, response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(request.getParameter("operacion").equals("guardarDatosPersonalesEmpresa")){
			try {
				modificarDatosPersonaACargo(request, response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			
	}
	
	protected void registrarEmpresa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String email = request.getParameter("emailEmpresa");
		String pass = request.getParameter("passEmpresa");
		//String rpass = request.getParameter("repEmpresa");
		
		
		Users user = new Users(email, pass, 3, 'A');
		this.servicioUsers.incluirUsers(user);
		
		Users myuser = this.servicioUsers.getUserPorField("email", email);
		
		Empresa empresa = new Empresa(myuser.getId(), " ", " ", 0, 
				0, 0, " ", " ", 'A');
		this.servicioEmpresa.incluirEmpresa(empresa);
		
		PersonaEmpresa personaEmpresa = new PersonaEmpresa(myuser.getId(), " ", " ", " ",
				" ", 'A');
		this.servicioPersonaEmpresa.incluirPersonaEmpresa(personaEmpresa);
		
		request.setAttribute("user", myuser);
		request.setAttribute("datosempresa", this.servicioEmpresa.getEmpresaPorField("usuario", myuser.getId()));
		request.setAttribute("personaacargo", this.servicioPersonaEmpresa.getPersonaEmpresaPorField("usuario", myuser.getId()));
		
		request.getRequestDispatcher("vistas/PerfilEmpresa.ftl").forward(request, response);
	}
	
	protected void modificarDatosEmpresa(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException{
		/*if (parametros.get("nombre").equals("")||
				parametros.get("descripcion").equals("")||
				parametros.get("idCategoria").equals("")||
				parametros.get("cantidad").equals("")||
				parametros.get("medida").equals("")||
				parametros.get("precio").equals("")) {
				response.getWriter().print("error:Debe indicar los valores requeridos");
			}			
			else {*/
				Integer id = Integer.parseInt(request.getParameter("user"));
				String nombre = request.getParameter("nombreempresa");
				String rif = request.getParameter("rif");
				Integer pais = Integer.parseInt(request.getParameter("pais"));
				Integer estado = Integer.parseInt(request.getParameter("estado"));
				Integer ciudad = Integer.parseInt(request.getParameter("ciudad"));
				String direccion = request.getParameter("direccion");
				String descripcion = request.getParameter("descripcionEmpresa");
	
				Empresa empresa = this.servicioEmpresa.modificarEmpresa(id, nombre, rif, pais, estado, ciudad, direccion, descripcion);
				try {
					ObjectMapper objectMapper = new ObjectMapper();				
					response.getWriter().print(objectMapper.writeValueAsString(empresa));
				} 
				catch (Exception e) {
					response.getWriter().print("error:"+e.getMessage());
				}
			//}
	}
	
	protected void modificarDatosPersonaACargo(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException{
		/*if (parametros.get("nombre").equals("")||
				parametros.get("descripcion").equals("")||
				parametros.get("idCategoria").equals("")||
				parametros.get("cantidad").equals("")||
				parametros.get("medida").equals("")||
				parametros.get("precio").equals("")) {
				response.getWriter().print("error:Debe indicar los valores requeridos");
			}			
			else {*/
				Integer id = Integer.parseInt(request.getParameter("user"));
				String nombre = request.getParameter("nombreContactoPC");
				String apellido = request.getParameter("apellidosPC");
				String cargo = request.getParameter("cargo");
				String telefono = request.getParameter("telefonoPC");
	
				PersonaEmpresa personaEmpresa = this.servicioPersonaEmpresa.modificarPersonaEmpresa(id, nombre, apellido, cargo, telefono);
				try {
					ObjectMapper objectMapper = new ObjectMapper();				
					response.getWriter().print(objectMapper.writeValueAsString(personaEmpresa));
				} 
				catch (Exception e) {
					response.getWriter().print("error:"+e.getMessage());
				}
			//}
	}
}