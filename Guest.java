public class Guest extends customer {
    private boolean isGuest; // Flag to indicate guest mode

    public Guest(int customerId, String name, String phoneNumber, String emailId, String address) {
        super(customerId, name, phoneNumber, emailId, address);
        this.isGuest = true;
    }

    // Method to log in as a guest
    public void loginAsGuest() {
        if (super.isLoggedIn) {
            System.out.println("Already logged in!");
            return;
        }

        isGuest = true;
        System.out.println("Logged in as a guest!");
    }

    // Method to log out
    @Override
    public void logout() {
        super.isLoggedIn = false;
        isGuest = false; // Reset guest mode
        System.out.println("Logged out successfully!");
    }
}
