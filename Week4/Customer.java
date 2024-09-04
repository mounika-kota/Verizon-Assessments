class Customer {
    String name;

    // Constructor to initialize the customer name
    Customer(String name) {
        this.name = name;
    }

    // Method to display the customer name
    void displayCustomerName() {
        System.out.println("Customer Name: " + name);
    }

    public static void main(String[] args) {
        // Create an instance of Customer with the name "VerizonUser"
        Customer c = new Customer("VerizonUser");

        // Call the method to display the customer name
        c.displayCustomerName();
    }
}
