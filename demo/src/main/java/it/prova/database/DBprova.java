package it.prova.database;

import it.prova.resource.Beanprova;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class DBprova{
	
	private DBCollection col;
	
	public DBprova(MongoClient mongo){	
		this.col = mongo.getDB("demo_db").getCollection("sample");		
	}
	
	public List<Beanprova> readAllData() {
        List<Beanprova> data = new ArrayList<Beanprova>();
        DBCursor cursor = col.find();
        while (cursor.hasNext()) {
            DBObject doc = cursor.next();
            
            Beanprova p = new Beanprova();
            p.setTemp((String) doc.get("temp"));
            p.setDate((String) doc.get("date"));
            data.add(p);
        }
        return data;
    }
	
}