package mistFinal;
import java.util.Objects;

public class Product {
    private int productId;
    private String name;
    private String group;
    private double price;
    private double discountedPrice;
    private int quantity;

    public Product(int productId, String name, String group, double price, double discountedPrice, int quantity) {
        this.productId = productId;
        this.name = name;
        this.group = group;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.quantity = quantity;
    }

    // Getters and setters

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Additional methods

    public boolean isAvailable() {
        return quantity > 0;
    }

    public double calculateTotalPrice(int quantity) {
        double totalPrice = price * quantity;
        if (discountedPrice < price) {
            totalPrice = discountedPrice * quantity;
        }
        return totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId &&
                Double.compare(product.price, price) == 0 &&
                Double.compare(product.discountedPrice, discountedPrice) == 0 &&
                Objects.equals(name, product.name) &&
                Objects.equals(group, product.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, name, group, price, discountedPrice);
    }
    
    // Method to generate product description
    public String generateDescription() {
        StringBuilder description = new StringBuilder();
        description.append("Product ID: ").append(productId).append("\n");
        description.append("Name: ").append(name).append("\n");
        description.append("Brand: ").append(group).append("\n");
        description.append("Price: $").append(price).append("\n");
        description.append("Discounted Price: $").append(discountedPrice).append("\n");
        description.append("Quantity: ").append(quantity).append("\n");
        return description.toString();
    }
}

