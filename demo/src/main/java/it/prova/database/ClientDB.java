package it.prova.database;

import java.net.UnknownHostException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.mongodb.MongoClient;

@WebListener
public class ClientDB implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	public void contextInitialized(ServletContextEvent sce) {
		
		try {
		    MongoClient mongoClient = new MongoClient( "localhost", 27017 );
		    System.out.println("MongoClient initialized successfully");
            sce.getServletContext().setAttribute("MONGO_CLIENT", mongoClient);
		} catch (UnknownHostException e) {
            throw new RuntimeException("MongoClient init failed");
        }
		
		
	}
	
	
	
	
}