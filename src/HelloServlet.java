import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private static String titulo = "Proyecto de laboratorio II";
	private static List<Integrante> integranteList = new ArrayList<Integrante>();
	
	static {
		integranteList.add(new Integrante("Zaidibeth", "Ramos"));
		integranteList.add(new Integrante("Kilver", "Rodriguez"));
		integranteList.add(new Integrante("Hermes", "Soto"));
		integranteList.add(new Integrante("Jonas", "Valdez"));
		integranteList.add(new Integrante("Marcel", "Viera"));
	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setAttribute("title", titulo);
		request.setAttribute("integrantes", integranteList);
		
		request.getRequestDispatcher("/index.ftl").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	}
}