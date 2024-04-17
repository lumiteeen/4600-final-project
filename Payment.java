
public class Payment {
    private String customerName;
    private int customerId;
    private String cardName;

    // Constructor
    public Payment(String customerName, int customerId, String cardName) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.cardName = cardName;
    }

    // Getters and Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
}
