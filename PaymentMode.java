public interface PaymentMode {
    double determineDiscount(double totalAmount);
}