package mistFinal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    private int customerId;
    private String name;
    private String phoneNumber;
    private String emailId;
    private String address;
    private boolean isLoggedIn;
    
    private static List<LoginCredentials> validCredentials = new ArrayList<>();
    
    static {
        // Populate the list with valid credentials
        validCredentials.add(new LoginCredentials("example@example.com", "password"));
        // Add more valid credentials if needed
    }


    public Customer(int customerId, String name, String phoneNumber, String emailId, String address) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.address = address;
        this.isLoggedIn = false;
    }

    public Customer() {
	}

	// Method to log in
    public void login() {
        if (isLoggedIn) {
            System.out.println("Already logged in!");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email ID: ");
        String inputEmail = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        // Check if the entered credentials match any valid pair
        for (LoginCredentials credentials : validCredentials) {
            if (inputEmail.equals(credentials.getEmail()) && password.equals(credentials.getPassword())) {
                isLoggedIn = true;
                System.out.println("Logged in successfully!");
                System.out.println();
                return;
            }
        }

        // If no matching credentials are found
        System.out.println("Invalid email ID or password. Please try again.");
    }
    public static void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email ID: ");
        String emailId = scanner.nextLine();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        System.out.println("Create a password: ");
        String password = scanner.nextLine();

        // Check if the email ID is already registered
        for (LoginCredentials credentials : validCredentials) {
            if (emailId.equals(credentials.getEmail())) {
                System.out.println("Email ID already exists. Registration failed.");
                return;
            }
        }

        // If the email ID is not registered, add new credentials
        validCredentials.add(new LoginCredentials(emailId, password));
        System.out.println("Registration successful!");
        System.out.println();
    }


    // Method to add items to cart
    public void addItems() {
        if (isLoggedIn) {
            
            System.out.println("Adding items to cart...");
        } else {
            System.out.println("Please log in first.");
        }
    }

    // Method to edit cart
    public void editCart() {
        if (isLoggedIn) {
            // Implementation of editing cart
            System.out.println("Editing cart...");
        } else {
            System.out.println("Please log in first.");
        }
    }

    // Method to edit customer details
    public void editDetails() {
        if (isLoggedIn) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter new name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter new phone number: ");
            String newPhoneNumber = scanner.nextLine();
            System.out.println("Enter new email ID: ");
            String newEmailId = scanner.nextLine();
            System.out.println("Enter new address: ");
            String newAddress = scanner.nextLine();

            this.name = newName;
            this.phoneNumber = newPhoneNumber;
            this.emailId = newEmailId;
            this.address = newAddress;

            System.out.println("Details updated successfully!");
            scanner.close();
        } else {
            System.out.println("Please log in first.");
        }
       
    }

    // Method to make payment
    public void makePayment() {
        if (isLoggedIn) {
            // Implementation of making payment
            System.out.println("Making payment...");
        } else {
            System.out.println("Please log in first.");
        }
    }

    // Method to log out
    public void logout() {
        isLoggedIn = false;
        System.out.println("Logged out successfully!");
    }
    private static class LoginCredentials {
        private String email;
        private String password;

        public LoginCredentials(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }
    }
}
