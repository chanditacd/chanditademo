package stepdefinition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class DatabaseConnection 

{
	public Statement s;
	
	public Statement dbmethod() throws SQLException
	{
	
Connection con=null;
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chandita","root","chandita");
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	 Statement s=con.createStatement();
	 
	 return s;
	 
	 
	
	
	
}
}



