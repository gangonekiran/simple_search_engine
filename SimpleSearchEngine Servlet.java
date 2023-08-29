import java.util.ArrayList;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//   This is a class servlet and map it to a URL 
@WebServlet("/SearchEngine")
public class SearchEngine extends HttpServlet {
	private static final long serialVersionUID = 1L;

    //   Method that handles HTTP post requests
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     
		//   Get the value of the parameter query from request
		String query = request.getParameter("query");
		
		//   Perform the search using the query
	     List<String> searchResults = performSearch(query);
	     
	     //   Set the search results as an attribute in the request
	     request.setAttribute("searchResults", searchResults);
	     
	     //   Forward the request to Java Server Pages for rendering
	     request.getRequestDispatcher("searchResults.jsp").forward(request, response);
	}
	
	//   Method to perform simple search engine using query and documents
	public List<String>performSearch(String query){
		
	    //  Create a list of documents	
		List<String> documents= new ArrayList<>();
		documents.add("Java is Programming language.");
		documents.add("JavaScript is used for Web Development.");
		documents.add("Python is known for its simplicity.");
		
		//   Create a list to store search results
		List<String> results=new ArrayList<>();
		
		//   Loop each document in the list
		for(String document: documents) {
			
			//   Check the document contains query of case-sensitive
			if(document.toLowerCase().contains(query.toLowerCase())) {
				
				//   add the document to the results list
				results.add(document);
			}
		}
		
		// return the list of search results
		return results;
	}

}
