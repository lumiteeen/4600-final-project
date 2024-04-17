
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
