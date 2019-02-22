package controladores;


import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.ObjectMapper;

import controladores.utils.Utils;
import modelos.dto.Users;
import modelos.dto.Conocimiento;
import modelos.dto.DatoLaboral;
import modelos.dto.DatoPersonal;
import modelos.dto.EstudioF;
import modelos.servicio.ServicioCV_Empresa;
import modelos.servicio.ServicioConocimiento;
import modelos.servicio.ServicioDatoLaboral;
import modelos.servicio.ServicioDatoPersonal;
import modelos.servicio.ServicioEstudioF;
import modelos.servicio.ServicioUsers;

@WebServlet("/ControladorProfile")
public class ControladorProfile extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ServicioUsers servicioUsers;
	private ServicioDatoPersonal servicioDatoPersonal;
	private ServicioDatoLaboral servicioDatoLaboral;
	private ServicioEstudioF servicioEstudioF;
	private ServicioConocimiento servicioConocimiento;
	private ServicioCV_Empresa servicioCV_Empresa;
	
	public ControladorProfile() {
		super();
		this.servicioUsers = ServicioUsers.getInstancia();
		this.servicioDatoPersonal = ServicioDatoPersonal.getInstancia();
		this.servicioDatoLaboral = ServicioDatoLaboral.getInstancia();
		this.servicioEstudioF = ServicioEstudioF.getInstancia();
		this.servicioConocimiento = ServicioConocimiento.getInstancia();
		this.servicioCV_Empresa = ServicioCV_Empresa.getInstancia();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//if(request.getParameter("user").equals(null)){
			
			//HttpSession misession= (HttpSession) request.getSession();
			 
			//Users sessionUser= (Users) misession.getAttribute("sessionUser");
			
			//String user = sessionUser.getEmail();
			//request.setAttribute("user", user);
		//}else{
		
		//}
		String user = request.getParameter("user");
		
		Users myuser = this.servicioUsers.getUserPorId(Integer.parseInt(user));
		//DatoPersonal mydatopersonal = this.servicioDatoPersonal.getDatoPersonalPorField("usuario", myuser.getId());
		//DatoLaboral mydatolaboral = this.servicioDatoLaboral.getDatoLaboralPorField("usuario", myuser.getId());
		
		request.setAttribute("user", myuser);
		request.setAttribute("datospersonales", this.servicioDatoPersonal.getDatoPersonalPorField("usuario", myuser.getId()));
		request.setAttribute("datoslaborales", this.servicioDatoLaboral.getDatosLaboralesPorField("usuario", myuser.getId()));
		request.setAttribute("estudiosFormales", this.servicioEstudioF.getEstudiosFPorField("usuario", myuser.getId()));
		request.setAttribute("conocimientos", this.servicioConocimiento.getConocimientosPorField("usuario", myuser.getId()));
		request.setAttribute("cvs", this.servicioCV_Empresa.getCV_EmpresasPorField("usuario", myuser.getId()));
		
		request.getRequestDispatcher("vistas/profile.ftl").forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if(request.getParameter("operacion").equals("registrarProfesional")){
			registrarProfesional(request, response);
		}else if(request.getParameter("operacion").equals("guardarDatosPersonales")){
			try {
				modificarDatosPersonales(request,response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(request.getParameter("operacion").equals("guardarDatosLaborales")){
			try {
				agregarDatosLaborales(request,response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(request.getParameter("operacion").equals("guardarEstudiosFormales")){
			try {
				agregarEstudiosFormales(request,response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(request.getParameter("operacion").equals("guardarConocimiento")){
			try {
				agregarConocimiento(request,response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String> parametros = Utils.getParameterMap(request);
		if(parametros.get("op").equals("eliminarDatosLaborales")){
			Integer id = Integer.parseInt(parametros.get("id"));
			response.getWriter().print(this.servicioDatoLaboral.eliminarDatoLaboral(id));
		}else if(parametros.get("op").equals("eliminarEstudios")){
			Integer id = Integer.parseInt(parametros.get("id"));
			response.getWriter().print(this.servicioEstudioF.eliminarEstudioF(id));
		}else if(parametros.get("op").equals("eliminarConocimiento")){
			Integer id = Integer.parseInt(parametros.get("id"));
			response.getWriter().print(this.servicioConocimiento.eliminarConocimiento(id));
		}else if(parametros.get("op").equals("eliminarCV_Empresa")){
			Integer id = Integer.parseInt(parametros.get("id"));
			response.getWriter().print(this.servicioCV_Empresa.eliminarCV_Empresa(id));
		}
	}
	
	protected void registrarProfesional(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String email = request.getParameter("emailProfesional");
		String pass = request.getParameter("passProfesional");
		//String rpass = request.getParameter("repProfesional");
		
		
		//if(pass == rpass){
			Users user = new Users(email, pass, 2, 'A');
			this.servicioUsers.incluirUsers(user);
			
			Users myuser = this.servicioUsers.getUserPorField("email", email);
			
			DatoPersonal datoPersonal = new DatoPersonal(myuser.getId(),
					" "," ",new Date(),'S'," ",0,0,0,'M'," ",'A');
			this.servicioDatoPersonal.incluirDatoPersonal(datoPersonal);
			
			DatoLaboral datoLaboral = new DatoLaboral(myuser.getId(),
					" "," ",0,'A'," ");
			this.servicioDatoLaboral.incluirDatoLaboral(datoLaboral);
			
			EstudioF estudioF = new EstudioF(myuser.getId(),
					" ",0,'A'," ");
			this.servicioEstudioF.incluirEstudioF(estudioF);
			
			
			HttpSession misession= request.getSession(true);
			Users sessionUser= new Users(email, pass, 2, 'A');
			misession.setAttribute("sessionUser",sessionUser);
			
			request.setAttribute("user", myuser);
			
			request.setAttribute("datospersonales", this.servicioDatoPersonal.getDatoPersonalPorField("usuario", myuser.getId()));
			request.setAttribute("datoslaborales", this.servicioDatoLaboral.getDatosLaboralesPorField("usuario", myuser.getId()));
			request.setAttribute("estudiosFormales", this.servicioEstudioF.getEstudiosFPorField("usuario", myuser.getId()));
			
			request.setAttribute("conocimientos", this.servicioConocimiento.getConocimientosPorField("usuario", myuser.getId()));
			request.setAttribute("cvs", this.servicioCV_Empresa.getCV_EmpresasPorField("usuario", myuser.getId()));
			
			request.getRequestDispatcher("vistas/profile.ftl").forward(request, response);
		//}
	
	}
	
	protected void agregarDatosLaborales(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException{
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
				String empresa = request.getParameter("nombreEmpresa");
				String cargo = request.getParameter("cargo");
				Integer area = Integer.parseInt(request.getParameter("area"));
				char estado = request.getParameter("estado").charAt(0);
				String periodo = request.getParameter("periodo");
				
				DatoLaboral datoLaboral = new DatoLaboral(id, empresa, cargo, area, estado, periodo);
				this.servicioDatoLaboral.incluirDatoLaboral(datoLaboral);
				try {
					ObjectMapper objectMapper = new ObjectMapper();				
					response.getWriter().print(objectMapper.writeValueAsString(datoLaboral));
				} 
				catch (Exception e) {
					response.getWriter().print("error:"+e.getMessage());
				}
			//}
	}
	
	protected void agregarEstudiosFormales(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException{
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
				String centro = request.getParameter("centroEducativo");
				Integer nivel = Integer.parseInt(request.getParameter("nivelEstudios"));
				char estado = request.getParameter("estadoEstudio").charAt(0);
				String periodo = request.getParameter("periodo");
				
				EstudioF estudioF = new EstudioF(id, centro, nivel, estado, periodo);
				this.servicioEstudioF.incluirEstudioF(estudioF);
				try {
					ObjectMapper objectMapper = new ObjectMapper();				
					response.getWriter().print(objectMapper.writeValueAsString(estudioF));
				} 
				catch (Exception e) {
					response.getWriter().print("error:"+e.getMessage());
				}
			//}
	}
	
	protected void modificarDatosPersonales(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException{
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
				String nombre = request.getParameter("nombre");
				String apellido = request.getParameter("apellido");
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				Date fechaNac = dateFormat.parse(request.getParameter("fechaNac"));				
				char estadoCivil = request.getParameter("estadoCivil").charAt(0);
				String telefono = request.getParameter("telefono");
				Integer pais = Integer.parseInt(request.getParameter("pais"));
				Integer estado = Integer.parseInt(request.getParameter("estado"));
				Integer ciudad = Integer.parseInt(request.getParameter("ciudad"));
				char genero = request.getParameter("genero").charAt(0);
				String descripcion = request.getParameter("descripcionPerfil");			
				DatoPersonal datoPersonal = this.servicioDatoPersonal.modificarDatoPersonal(id, nombre, 
						apellido, fechaNac, estadoCivil, telefono, pais, estado, ciudad,
						genero, descripcion);
				try {
					ObjectMapper objectMapper = new ObjectMapper();				
					response.getWriter().print(objectMapper.writeValueAsString(datoPersonal));
				} 
				catch (Exception e) {
					response.getWriter().print("error:"+e.getMessage());
				}
			//}
	}
	
	protected void agregarConocimiento(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException{
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
				String nombre = request.getParameter("conocimiento");
				
				Conocimiento conocimiento = new Conocimiento(id, nombre, 'A');
				this.servicioConocimiento.incluirConocimiento(conocimiento);
				try {
					ObjectMapper objectMapper = new ObjectMapper();				
					response.getWriter().print(objectMapper.writeValueAsString(conocimiento));
				} 
				catch (Exception e) {
					response.getWriter().print("error:"+e.getMessage());
				}
			//}
	}
	
}
