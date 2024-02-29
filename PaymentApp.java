public class PaymentApp {
    public static void main(String[] args){
        Order order = new Order("keyboard", 3000, 10);

        PaymentMode Gcash = new GCash();
        PaymentMode maya = new Maya();
        PaymentMode shopeePay = new ShopeePay();

        order.DisplayPayment();

        order.setPaymentMode(Gcash);
        order.DiscountTotalAmount();
        order.DisplayPayment3();

        order.setPaymentMode(maya);
        order.DiscountTotalAmount();
        order.DisplayPayment2();

        order.setPaymentMode(shopeePay);
        order.DiscountTotalAmount();
        order.DisplayPayment2();
    }
}