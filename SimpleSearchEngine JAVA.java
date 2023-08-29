package New;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleSearchEngine {

	public static void main(String[] args) {
		
	//  Create a list of documents	
    List<String> documents = new ArrayList<>();
    
    documents.add("Java is a programming language.");
    documents.add("Python is known for its simplicity.");
    documents.add("JavaScript is used for web development.");
    
    //  Create a Scanner Object to read user input
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a search query:");
    
    //  Read the user's search query
    String query = s.nextLine();
    
    //  Perform the search and store the results in list
    List<String> searchResults= search(documents, query);
    
    
    //  Display search results or a message if no results were found
    if(searchResults.isEmpty()) {
    	System.out.println("No documents match the query.");
    }
    else
    {
    	System.out.println("Search results:");
    	for(String result : searchResults) {
    		System.out.println(result);
    	}
    }
	}

	
	//  Function to perform a simple search
	public static List<String> search(List<String> documents, String query){
		List<String>searchResults =new ArrayList<>();
		query = query.toLowerCase(); // Convert query to Lower case for insensitive
		
		//  Iterate through each document and check if it is contains the query
		for(String document : documents) {
			if(document.toLowerCase().contains(query)) {
				searchResults.add(document);  //  Add matching documents to the results list
			}
		}
		return searchResults;   //  Return the list of search results
	}
}
