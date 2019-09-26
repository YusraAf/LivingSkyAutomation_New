package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostGreConnection {
	
	
// Connection for test environment database in postgre	
private static	String url = "jdbc:postgresql://test-us-east-1.celhkzfjom8w.us-east-1.rds.amazonaws.com:5432/";
private static String username = "postgres";
private static String password = "38W7YrnuhluHxfteHLhB";
static Connection db ;
	
public static void postGreDbConnectionOpen() {
	try {
        Class.forName("org.postgresql.Driver");
    }
    catch (java.lang.ClassNotFoundException e) {
        System.out.println(e.getMessage());
    }
    // replace below details
    
    try {
         db = DriverManager.getConnection(url, username, password);
    	
        }
    catch (java.sql.SQLException e) {
        System.out.println(e.getMessage());
    }
}

public static void dbClose() {
	try {
		db.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
}
	/*
	  public static void main(String[] args) { 
		  PostGreConnection ps = new  PostGreConnection(); 
		  ps.postGreDbConnectionOpen(); DbQuery dbq= new
	  DbQuery(); try { 
		  dbq.deleteData();
		  } catch (SQLException e) { 
			  System.out.println("No data is return"); 
	  } 
	  
	  try {
	  dbq.selectData(); } catch (SQLException e) { // TODO Auto-generated catch
	  block e.printStackTrace(); }
	 
	  }
	  */
}

