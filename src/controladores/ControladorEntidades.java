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
import modelos.servicio.ServicioUsers;
import modelos.dto.AreaProfesional;
import modelos.dto.Cargo;
import modelos.dto.Carrera;
import modelos.dto.Ciudad;
import modelos.dto.DatoLaboral;
import modelos.dto.DatoPersonal;
import modelos.dto.Dedicacion;
import modelos.dto.Estado;
import modelos.dto.EstudioF;
import modelos.dto.Etapa;
import modelos.dto.Idioma;
import modelos.dto.Pais;
import modelos.dto.Users;
import modelos.servicio.ServicioAreaProfesional;
import modelos.servicio.ServicioCargo;
import modelos.servicio.ServicioCarrera;
import modelos.servicio.ServicioCiudad;
import modelos.servicio.ServicioDatoLaboral;
import modelos.servicio.ServicioDatoPersonal;
import modelos.servicio.ServicioDedicacion;
import modelos.servicio.ServicioEmpresa;
import modelos.servicio.ServicioEstado;
import modelos.servicio.ServicioEstudioF;
import modelos.servicio.ServicioEtapa;
import modelos.servicio.ServicioIdioma;
import modelos.servicio.ServicioPais;

@WebServlet("/ControladorEntidades")
public class ControladorEntidades extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ServicioUsers servicioUsers;
	private ServicioCiudad servicioCiudad;
	private ServicioEstado servicioEstado;
	private ServicioPais servicioPais;
	private ServicioIdioma servicioIdioma;
	private ServicioDedicacion servicioDedicacion;
	private ServicioCargo servicioCargo;
	private ServicioCarrera servicioCarrera;
	private ServicioEtapa servicioEtapa;
	private ServicioAreaProfesional servicioAreaProfesional;
	private ServicioEmpresa servicioEmpresa;
	
	public ControladorEntidades() {
		super();
		this.servicioUsers = ServicioUsers.getInstancia();
		this.servicioCiudad = ServicioCiudad.getInstancia();
		this.servicioEstado=ServicioEstado.getInstancia();
		this.servicioPais=ServicioPais.getInstancia();
		this.servicioIdioma=ServicioIdioma.getInstancia();
		this.servicioDedicacion=ServicioDedicacion.getInstancia();
		this.servicioCargo=ServicioCargo.getInstancia();
		this.servicioCarrera=ServicioCarrera.getInstancia();
		this.servicioEtapa=ServicioEtapa.getInstancia();
		this.servicioAreaProfesional=ServicioAreaProfesional.getInstancia();
		this.servicioEmpresa=ServicioEmpresa.getInstancia();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		request.setAttribute("Mensaje","HOLAAAAAAAAAAA");
		
		request.setAttribute("users",this.servicioUsers.getUsers());
		request.setAttribute("empresas",this.servicioEmpresa.getEmpresas());
		request.setAttribute("ciudades", this.servicioCiudad.getCiudades());
		request.setAttribute("estados", this.servicioEstado.getEstados());
		request.setAttribute("paises", this.servicioPais.getPaises());
		request.setAttribute("dedicaciones", this.servicioDedicacion.getDedicaciones());
		request.setAttribute("idiomas", this.servicioIdioma.getIdiomas());
		request.setAttribute("cargos", this.servicioCargo.getCargos());
		request.setAttribute("carreras", this.servicioCarrera.getCarreras());
		request.setAttribute("areasProfesionales", this.servicioAreaProfesional.getAreasProfesionales());
		request.setAttribute("etapas", this.servicioEtapa.getEtapas());
		request.setAttribute("empresas",this.servicioEmpresa.getEmpresas());
		request.getRequestDispatcher("vistas/ModificarEntidades.ftl").forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if(request.getParameter("operacion").equals("guardarCiudad")){
			try {
				agregarCiudad(request,response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(request.getParameter("operacion").equals("guardarEstado")){
			try {
				agregarEstado(request,response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(request.getParameter("operacion").equals("guardarPais")){
			try {
				agregarPais(request,response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(request.getParameter("operacion").equals("guardarAreaProfesional")){
			try {
				agregarAreaProfesional(request,response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(request.getParameter("operacion").equals("guardarCargo")){
			try {
				agregarCargo(request,response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(request.getParameter("operacion").equals("guardarCarrera")){
			try {
				agregarCarrera(request,response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(request.getParameter("operacion").equals("guardarDedicacion")){
			try {
				agregarDedicacion(request,response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(request.getParameter("operacion").equals("guardarEtapa")){
			try {
				agregarEtapa(request,response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(request.getParameter("operacion").equals("guardarIdioma")){
			try {
				agregarIdioma(request,response);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String> parametros = Utils.getParameterMap(request);
		if(parametros.get("op").equals("eliminarCiudad")){
			Integer id = Integer.parseInt(parametros.get("id"));
			response.getWriter().print(this.servicioCiudad.eliminarCiudad(id));
		}else if(parametros.get("op").equals("eliminarEstado")){
			Integer id = Integer.parseInt(parametros.get("id"));
			response.getWriter().print(this.servicioEstado.eliminarEstado(id));
		}else if(parametros.get("op").equals("eliminarPais")){
			Integer id = Integer.parseInt(parametros.get("id"));
			response.getWriter().print(this.servicioPais.eliminarPais(id));
		}else if(parametros.get("op").equals("eliminarAreaProfesional")){
			Integer id = Integer.parseInt(parametros.get("id"));
			response.getWriter().print(this.servicioAreaProfesional.eliminarAreaProfesional(id));
		}else if(parametros.get("op").equals("eliminarCargo")){
			Integer id = Integer.parseInt(parametros.get("id"));
			response.getWriter().print(this.servicioCargo.eliminarCargo(id));
		}else if(parametros.get("op").equals("eliminarCarrera")){
			Integer id = Integer.parseInt(parametros.get("id"));
			response.getWriter().print(this.servicioCarrera.eliminarCarrera(id));
		}else if(parametros.get("op").equals("eliminarDedicacion")){
			Integer id = Integer.parseInt(parametros.get("id"));
			response.getWriter().print(this.servicioDedicacion.eliminarDedicacion(id));
		}else if(parametros.get("op").equals("eliminarIdioma")){
			Integer id = Integer.parseInt(parametros.get("id"));
			response.getWriter().print(this.servicioIdioma.eliminarIdioma(id));
		}else if(parametros.get("op").equals("eliminarEtapa")){
			Integer id = Integer.parseInt(parametros.get("id"));
			response.getWriter().print(this.servicioEtapa.eliminarEtapa(id));
		}
	}
	
	protected void agregarCiudad(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException{
				Integer estado = Integer.parseInt(request.getParameter("estado"));
				String nombre = request.getParameter("nombre");
	
				Ciudad ciudad = new Ciudad(estado, nombre, 'A');
				this.servicioCiudad.incluirCiudad(ciudad);
				try {
					ObjectMapper objectMapper = new ObjectMapper();				
					response.getWriter().print(objectMapper.writeValueAsString(ciudad));
				} 
				catch (Exception e) {
					response.getWriter().print("error:"+e.getMessage());
				}
	}
	
	protected void agregarEstado(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException{
				Integer pais = Integer.parseInt(request.getParameter("pais"));
				String nombre = request.getParameter("nombre");
				
				Estado estado = new Estado(pais, nombre, 'A');
				this.servicioEstado.incluirEstado(estado);
				try {
					ObjectMapper objectMapper = new ObjectMapper();				
					response.getWriter().print(objectMapper.writeValueAsString(estado));
				} 
				catch (Exception e) {
					response.getWriter().print("error:"+e.getMessage());
				}

	}
	
	protected void agregarAreaProfesional(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException{
		String nombre = request.getParameter("nombre");
		
		AreaProfesional ap = new AreaProfesional(nombre, 'A');
		this.servicioAreaProfesional.incluirAreaProfesional(ap);
		try {
			ObjectMapper objectMapper = new ObjectMapper();				
			response.getWriter().print(objectMapper.writeValueAsString(ap));
		} 
		catch (Exception e) {
			response.getWriter().print("error:"+e.getMessage());
		}
	}
	
	protected void agregarCargo(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException{
		String nombre = request.getParameter("nombre");
		
		Cargo c = new Cargo(nombre, 'A');
		this.servicioCargo.incluirCargo(c);
		try {
			ObjectMapper objectMapper = new ObjectMapper();				
			response.getWriter().print(objectMapper.writeValueAsString(c));
		} 
		catch (Exception e) {
			response.getWriter().print("error:"+e.getMessage());
		}
	}
	
	protected void agregarPais(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException{
		String nombre = request.getParameter("nombre");
		
		Pais pais = new Pais(nombre, 'A');
		this.servicioPais.incluirPais(pais);
		try {
			ObjectMapper objectMapper = new ObjectMapper();				
			response.getWriter().print(objectMapper.writeValueAsString(pais));
		} 
		catch (Exception e) {
			response.getWriter().print("error:"+e.getMessage());
		}
	}
	
	protected void agregarCarrera(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException{
		String nombre = request.getParameter("nombre");
		Integer area = Integer.parseInt(request.getParameter("area"));
		
		Carrera c = new Carrera(area, nombre, 'A');
		this.servicioCarrera.incluirCarrera(c);
		try {
			ObjectMapper objectMapper = new ObjectMapper();				
			response.getWriter().print(objectMapper.writeValueAsString(c));
		} 
		catch (Exception e) {
			response.getWriter().print("error:"+e.getMessage());
		}
	}
	
	protected void agregarDedicacion(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException{
		String descripcion = request.getParameter("descripcion");
		Integer horasTrabajadas = Integer.parseInt(request.getParameter("horasTrabajadas"));
		
		Dedicacion d = new Dedicacion(descripcion, horasTrabajadas, 'A');
		this.servicioDedicacion.incluirDedicacion(d);
		try {
			ObjectMapper objectMapper = new ObjectMapper();				
			response.getWriter().print(objectMapper.writeValueAsString(d));
		} 
		catch (Exception e) {
			response.getWriter().print("error:"+e.getMessage());
		}
	}
	
	protected void agregarEtapa(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException{
		String descripcion = request.getParameter("descripcion");
		
		Etapa etapa = new Etapa(descripcion, 'A');
		this.servicioEtapa.incluirEtapa(etapa);
		try {
			ObjectMapper objectMapper = new ObjectMapper();				
			response.getWriter().print(objectMapper.writeValueAsString(etapa));
		} 
		catch (Exception e) {
			response.getWriter().print("error:"+e.getMessage());
		}
	}
	
	protected void agregarIdioma(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException{
		String nombre = request.getParameter("nombre");
		
		Idioma i = new Idioma(nombre, 'A');
		this.servicioIdioma.incluirIdioma(i);
		try {
			ObjectMapper objectMapper = new ObjectMapper();				
			response.getWriter().print(objectMapper.writeValueAsString(i));
		} 
		catch (Exception e) {
			response.getWriter().print("error:"+e.getMessage());
		}
	}

}






