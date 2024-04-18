package mistFinal;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int id;
    private int productCount;
    private double totalPrice;
    private double discountedPrice;
    private List<Product> cartItems;
	private Customer customer;

    // Constructor
    public Cart() {
        this.cartItems = new ArrayList<>();
        this.customer = new Customer();
    }
    
    public Cart(int id, int productCount, double totalPrice, double discountedPrice) {
        this.id = id;
        this.productCount = productCount;
        this.totalPrice = totalPrice;
        this.discountedPrice = discountedPrice;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
    public void addToCart(Product product) {
        cartItems.add(product);
        System.out.println("Product added to cart: " + product.getName());
    }

    // Display items in cart
    public void displayCart() {
        System.out.println("Items in your cart:");
        for (Product item : cartItems) {
            System.out.println(item.generateDescription());
        }
    }
    public double calculateTotalPrice() {
        double total = 0.0;
        for (Product item : cartItems) {
            total += item.getDiscountedPrice()*item.getQuantity(); // Assuming discounted price is used for checkout
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        List<Product> products = new ArrayList<>();
        products.add(new Product(1001, "Red T-shirt with logo", "Supreme", 49.99, 39.99, 1500));
        products.add(new Product(1002, "Blue original logo", "Vans", 29.99, 19.99, 1500));
        products.add(new Product(1003, "Jordan 1's", "Nike", 139.99, 99.99, 1500));
        products.add(new Product(1004, "Panda Dunks", "Nike", 99.99, 69.99, 1500));

        Cart cart = new Cart();

        do {
            try {
                System.out.println("The MIST store:");
                System.out.println("1. Browse Products");
                System.out.println("2. Add to Cart");
                System.out.println("3. View Cart");
                System.out.println("4. Checkout");
                System.out.println("5. Login");
                System.out.println("6. Register");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("You chose Browse Products");
                        for (Product prd : products) {
                            System.out.println(prd.generateDescription());
                        }
                        break;
                    case 2:
                        System.out.println("You chose Add to Cart");
                        System.out.print("Enter the product ID to add to cart: ");
                        int productId = scanner.nextInt();
                        // Find the product by ID and add it to the cart
                        boolean found = false;
                        for (Product product : products) {
                            if (product.getProductId() == productId) {
                                cart.addToCart(product);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Product not found!");
                        }
                        break;
                    case 3:
                        System.out.println("You chose View Cart");
                        cart.displayCart();
                        break;
                    case 4:
                        System.out.println("You chose Checkout");
                        double totalPrice = cart.calculateTotalPrice();
                        System.out.println("Total Price: $" + totalPrice);
                        // Perform action for Checkout
                        break;
                    case 5:
                    	System.out.println("You chose Login");
                    	cart.customer.login();
                    	break;
                    case 6:
                    	System.out.println("You chose Register");
                    	Customer.register();
                    	break;
                    case 7:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
                choice = 0; // Reset choice to continue the loop
            }

        } while (choice != 7);

        scanner.close();
    }
}