public class Order {
    private CalculateTotal calculateTotal;
    private PlaceOrder placeOrder;
    private GenerateInvoice generateInvoice;
    private SendEmailNotification sendEmailNotification;

    public Order(CalculateTotal calculateTotal, PlaceOrder placeOrder, GenerateInvoice generateInvoice, SendEmailNotification sendEmailNotification) {
        this.calculateTotal = calculateTotal;
        this.placeOrder = placeOrder;
        this.generateInvoice = generateInvoice;
        this.sendEmailNotification = sendEmailNotification;
    }

    public void processOrder(double price, int quantity, String customerName, String address, String fileName, String email) {
        double total = calculateTotal.calculateTotal(price, quantity);
        System.out.println("Order total: $" + total);
        placeOrder.placeOrder(customerName, address);
        generateInvoice.generateInvoice(fileName);
        sendEmailNotification.sendEmailNotification(email);
    }
}
