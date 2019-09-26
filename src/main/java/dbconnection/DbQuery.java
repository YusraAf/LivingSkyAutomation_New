package dbconnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbQuery extends PostGreConnection{

	public void deleteData(String query) {
		
		try {
		// create object for the Statement class
        Statement st = db.createStatement();
        
        // execute the query on database
       
       st.executeQuery(query);
       st.close();
        
		}catch(SQLException e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	public void selectData(String query)  {
		// create object for the Statement class
        
		try {
		Statement st = db.createStatement();
        
        // execute the query on database
        ResultSet rs = st.executeQuery(query);
        //"Select * from public.\"unverifiedUsers\" where email like '%niti%'"
        System.out.println("Data retrieved from the PostgreSQL database ");
        
        while (rs.next()) {
            System.out.println(rs.getString(1) + " | "+rs.getString(2) +" | "+ rs.getString(3));
        }
        
        // close the result set
        rs.close();
       
        st.close();
        
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
        
	}
	
}
