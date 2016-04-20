package it.prova.servlet;

import it.prova.database.DBprova;
import it.prova.resource.Beanprova;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;


@SuppressWarnings("serial")
@WebServlet(name="Prova", urlPatterns={"/editProva"})
public class Prova extends HttpServlet{
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		
		List<Beanprova> list = new ArrayList<Beanprova>();

		MongoClient mongo = (MongoClient) req.getServletContext().getAttribute("MONGO_CLIENT");
		DBprova dbprova = new DBprova(mongo);
		list = (ArrayList<Beanprova>) dbprova.readAllData();

		//debug:
		for(int i =0; i<list.size(); i++){
			Beanprova tmp = list.get(i);
			System.out.println(i + ": " + tmp.getDate() + " " + tmp.getTemp());
		}
		System.out.println("dimensione lista: " + list.size());
		
		req.setAttribute("data", list);
		req.setAttribute("num", "333");
		//req.getRequestDispatcher("NewFile.jsp").forward(req, res);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/NewFile.jsp");
        rd.forward(req, res);
	}
	
}