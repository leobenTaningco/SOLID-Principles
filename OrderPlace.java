public class OrderPlace implements PlaceOrder{
    public void placeOrder(String customerName, String address){
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}
