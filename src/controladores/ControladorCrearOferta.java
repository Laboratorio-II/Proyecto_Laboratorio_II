package controladores;

import java.io.IOException;

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
import com.mysql.cj.ParseInfo;
import controladores.utils.Utils;
import modelos.dto.Oferta;
import modelos.dto.Users;
import modelos.servicio.ServicioOferta;

@WebServlet("/ControladorCrearOferta")
public class ControladorCrearOferta extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ServicioOferta servicioOferta;
	
	public ControladorCrearOferta() {
		super();
		this.servicioOferta= ServicioOferta.getInstancia();

		
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("vistas/CrearOferta.ftl").forward(request, response);	
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if(request.getParameter("operacion1").equals("registrarOferta")) {
			registrarOferta(request, response);
			
		}else if (request.getParameter("operacion1").equals("agregarOferta")) 
		{
			try	{
				agregarOferta(request, response);
				
			}catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
								}
		}
	}
	

	protected void agregarOferta(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException{
	
				Integer idempresa = Integer.parseInt( request.getParameter("ambar"));				
				String descripcion= request.getParameter("descripcionsolicitado1");				
				Integer estado = Integer.parseInt(request.getParameter("estadoOferta"));
				Integer area = Integer.parseInt(request.getParameter("areaOferta"));
				Integer dedicacion = Integer.parseInt(request.getParameter("dedicacionOferta"));
				float salario = Float.parseFloat(request.getParameter("salarioOferta"));
				
				Oferta oferta = new Oferta( idempresa, descripcion,  estado, area, dedicacion,salario);
				this.servicioOferta.incluirOferta(oferta);
				try {
					ObjectMapper objectMapper = new ObjectMapper();				
					response.getWriter().print(objectMapper.writeValueAsString(oferta));
				} 
				catch (Exception e) {
					response.getWriter().print("error:"+e.getMessage());
				}
	}
	
	
	

	
	protected void registrarOferta(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		Integer id= Integer.parseInt(request.getParameter("ambar"));
		String descripcion= request.getParameter("descripcionsolicitado1");				

		
		Oferta oferta = new Oferta(id,descripcion,2,2,2,1000);
		this.servicioOferta.incluirOferta(oferta);
		
		Oferta myoferta= 	this.servicioOferta.getUserPorField("id", id);
		
		Oferta datooferta= new Oferta(myoferta.getIdempresa(),null,null,null,null,0);
		
		this.servicioOferta.incluirOferta(datooferta);	
		
		try {
			ObjectMapper objectMapper = new ObjectMapper();				
			response.getWriter().print(objectMapper.writeValueAsString(datooferta));
		} 
		catch (Exception e) {
			response.getWriter().print("error:"+e.getMessage());
		}
}
		
	
	
	
	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String> parametros = Utils.getParameterMap(request);
		
		 if(parametros.get("op").equals("eliminarOferta")){
			Integer id = Integer.parseInt(parametros.get("id"));
			response.getWriter().print(this.servicioOferta.eliminarOferta(id));
		}
	}
	
	
	
}



