package dbconnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbQuery extends PostGreConnection{

	public void deleteData() throws SQLException {
		
		// create object for the Statement class
        Statement st = db.createStatement();
        
        // execute the query on database
       
        ResultSet rs = st.executeQuery("Delete from public.\"unverifiedUsers\" where email like '%test%'");
        
        // close the result set
        rs.close();
        
       
        st.close();
	}
	
	public void selectData() throws SQLException {
		// create object for the Statement class
        Statement st = db.createStatement();
        
        // execute the query on database
        ResultSet rs = st.executeQuery("Select * from public.\"unverifiedUsers\" where email like '%niti%'");
        
        System.out.println("Data retrieved from the PostgreSQL database ");
        
        while (rs.next()) {
            System.out.println(rs.getString(1) + " | "+rs.getString(2) +" | "+ rs.getString(3));
        }
        rs.close();
        // close the result set
       
        st.close();
	}
	
}
