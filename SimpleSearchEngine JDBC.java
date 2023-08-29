//   Imported the packages for JDBC and SQL Handling 

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;


//   Creating a Class named as SearchEnigneJDBC
public class SearchEngineJDBC {

	//   Database connection details
	public static final String URL="jdbc:mysql://localhost:3306/simplesearchengine";
	public static final String username="root";
	public static final String password="ganeshkumar#04021999";
	
	
	//   This is the Main Method to Execute the program
	public static void main(String[] args) {
		
	    //  Create a Scanner Object to read user input
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your search query:");
		String query = s.nextLine();
		
		
		//   Perform the search using the query
		List<String>searchResults=performSearch(query);
		
		
		//   Display the search results
		if(searchResults.isEmpty()) {
			System.out.println("No search results found");
		}
		else
		{
			System.out.println("Search results:");
			for(String result: searchResults) {
				System.out.println("-"+result);
			}
		}
		    //   After use close the Scanner
            s.close();
	}
	
	//   Method that performs to search and return list search results
	private static List<String>performSearch(String query){
		
		    //   Create new ArrayList to store the search results
			List<String>results=new ArrayList<>();
			
			  try {
				  
				    //   It is a Driver connecting to MySQL Database
					Class.forName("com.mysql.cj.jdbc.Driver");
				
      try {
    	  
    	    //   Establish a connection to the Database
			Connection con=DriverManager.getConnection(URL,username,password);
			
			//   SQL query to retreive documents and matching the search query
			String sql= "SELECT * FROM searchenginedocuments WHERE text LIKE ?";
			
			//   Prepare a statement with SQL query
			PreparedStatement stmt= con.prepareStatement(sql);
			
			
		    //   Set the search query in the Prepared Statement
			stmt.setString(1, "%" +query+ "%");
					
			// This is the ResultSet to execute the query
	    	ResultSet rs= stmt.executeQuery();{
	    		
	    		
	    		
	    	//   Loop through the result set and extract the document_content	
			while(rs.next()) {
				String document =rs.getString("text");
			results.add(document);
		}
	}
			} 
      
      //   If there is Exception then this block will catch exception and handle it
      catch (Exception e) {
		
	}
}
 //  e is the variable 
 catch(Exception  e) {
	 
	 //   Print any Database errors
	 e.printStackTrace();
 }
			  
			  //   Retrun the list of search results
              return results;
 }
 }
 