public class OrderTest {
    public static void main(String[] args) {

        CalculateTotal calculateTotal = new TotalCalculate();
        PlaceOrder placeOrder= new OrderPlace();
        GenerateInvoice generateInvoice = new InvoiceGenerate();
        SendEmailNotification sendEmailNotification = new EmailNotificationSend();

        Order order = new Order(calculateTotal,placeOrder, generateInvoice, sendEmailNotification);
        order.processOrder(10.0, 2, "John Doe", "123 Main St", "order_123.pdf", "johndoe@example.com");
    }
}
