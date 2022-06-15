package library_management_system;
import java.sql.*;
public class conn {
	Connection c;
	Statement s;
	//public Object c;
	public conn()
	{
		//String databasename="library";
		//String url="jdbc:mysql://localhost:3306"+databasename;
		
		//String username="root";
		//String password="12345";
		//String databaseURL="jdbc:ucanaccess://C:\\Users\\jahna\\Documents\\library.accdb";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			
			
		c =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/library","root","12345");    
        s =c.createStatement();  
        
		//System.out.println("connected to database");
		
		  
		//c.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
