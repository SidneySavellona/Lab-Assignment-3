public class Order {

    private String item;
    private double unitPrice;
    private int quantity;
    private PaymentMode paymentMode;
    private double totalAmount;
    public Order(String item, double unitPrice, int quantity){
        this.item = item;
        this.unitPrice  = unitPrice;
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setPaymentMode(PaymentMode paymentMode){
        this.paymentMode = paymentMode;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void DiscountTotalAmount(){
        double totalPrice = unitPrice;
        double discount = paymentMode.determineDiscount(totalPrice);
        totalAmount = totalPrice - discount;
    }

    public void DisplayPayment () {
        System.out.println("Order item is " + item);
        System.out.println("Unit price is " + unitPrice);
        System.out.println("Quantity is " + quantity);
    }
    public void DisplayPayment2(){
        System.out.println("\nPayment order details if " + paymentMode.getClass().getSimpleName());
        double discountRate = paymentMode.determineDiscount(unitPrice * quantity) / (unitPrice * quantity);
        System.out.println("Discount rate is " + String.format("%.2f", discountRate));
        System.out.println("Payment amount is " + totalAmount);
    }
    public void DisplayPayment3(){
        System.out.println("\nPayment order details if "+ paymentMode.getClass().getSimpleName() );
        System.out.println("Discount rate is "+ paymentMode.determineDiscount(unitPrice * quantity));
        System.out.println("Payment amount is "+ totalAmount);
    }
    


}