import java.util.Scanner;

public class Cart {
    private int id;
    private int productCount;
    private double totalPrice;
    private double discountedPrice;

    // Constructor
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
}

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("The MIST store:");
            System.out.println("1. Browse Products");
            System.out.println("2. Checkout");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You chose Option A");
                    // Perform action for Option A
                    break;
                case 2:
                    System.out.println("You chose Option B");
                    // Perform action for Option B
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }

        } while (choice != 3);

        scanner.close();
    }
