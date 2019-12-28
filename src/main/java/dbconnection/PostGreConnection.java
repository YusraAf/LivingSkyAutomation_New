package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class PostGreConnection {
	
	
// Connection for test environment database in postgre	
//private static	String url = "jdbc:postgresql://test-us-east-1.celhkzfjom8w.us-east-1.rds.amazonaws.com:5432/";

static Connection db ;


public static void connectionTest() throws SQLException {
	
	String url = "jdbc:postgresql://dev-us-east-1.celhkzfjom8w.us-east-1.rds.amazonaws.com:5432/testCerberus";
	String username = "postgres";
	//private static String password = "38W7YrnuhluHxfteHLhB";

	String password = "Oojd4QBiPHpV";
	db = DriverManager.getConnection(url, username, password);
}


public static void connectionSTG() throws SQLException {
	
	String url = "jdbc:postgresql://test-us-east-1.celhkzfjom8w.us-east-1.rds.amazonaws.com:5432/cerberus";
	String username = "postgres";
	//private static String password = "38W7YrnuhluHxfteHLhB";

	String password = "38W7YrnuhluHxfteHLhB";
	db = DriverManager.getConnection(url, username, password);
}

	
public static void postGreDbConnectionOpen() {
	try {
        Class.forName("org.postgresql.Driver");
    }
    catch (java.lang.ClassNotFoundException e) {
        System.out.println(e.getMessage());
    }
    // replace below details
	
    try {
   
  if ("qa".equals(System.getProperty("active.env"))) {
	  connectionTest();
         System.out.println("DB COnnected in--------=" + System.getProperty("active.env"));
         
    }
    else if("stg".equals(System.getProperty("active.env")))
    {
    	System.out.println("DB COnnected in--------=" + System.getProperty("active.env"));
    	connectionSTG();
    	
    }
    else
    	System.out.println("DB COnnected in--------=" + System.getProperty("active.env"));
       
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

