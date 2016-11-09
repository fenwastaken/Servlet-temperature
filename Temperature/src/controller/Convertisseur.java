package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Temperature;

/**
 * Servlet implementation class Convertisseur
 */
@WebServlet("/Convertisseur")
public class Convertisseur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VUES = "VUES=/Vues/Convertisseur/", DEFVUE="Index.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Convertisseur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		String maVue = VUES + DEFVUE;
		System.out.println(maVue);
		try{
			if(action == null){
				
			}
			else if(action.equals("Index")){
				maVue = VUES + "Index.jsp";
			}
			else if(action.equals("AffichageRes")){
				maVue = VUES + "AffichageRes.jsp";
			}
		}
		catch(Exception e){
			maVue = VUES + "Exceptions.jsp";
			request.setAttribute("message", e.getMessage());
		}
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(maVue);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String valCelsius = request.getParameter("celsius");
		if(valCelsius.isEmpty()){
			valCelsius = "20";
		}
		Temperature temp = new Temperature(Double.valueOf(valCelsius));
		request.setAttribute("temperature", temp);
		String maVue = "/Vues/Convertisseur/AffichageRes.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(maVue);
		dispatcher.forward(request, response);
	}

}
