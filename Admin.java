import java.util.HashMap;
import java.util.Map;


public class Admin {
	
	private int id;
	private String name;
	private String email;
	private Map<Integer, String> products;

	public Admin(int id, String name, String email) {
		    this.id = id;
		    this.name = name;
		    this.email = email;
		    this.products = new HashMap<>();
		 }
	
	public void addProduct(int productId, String productName) {
		        products.put(productId, productName);
		        System.out.println("Product added successfully.");
		 }

	public void deleteProduct(int productId) {
		if (products.containsKey(productId)) {
		    		products.remove(productId);
		    		System.out.println("Product deleted successfully.");
		        } 
			else {
		            System.out.println("Product not found.");
		        }
		 }

	public void modifyProduct(int productId, String newName) {
		        if (products.containsKey(productId)) {
		            products.put(productId, newName);
		            System.out.println("Product modified successfully.");
		        } 
		     else {
		            System.out.println("Product not found.");
		        }
		 }

	public void handlingErrors() {
		        
		    }

	public void viewStatistics() {
		        
		    }

	public void fetchDetails() {
		        System.out.println("Admin ID: " + id);
		        System.out.println("Name: " + name);
		        System.out.println("Email: " + email);
		        
		   
	}
}


