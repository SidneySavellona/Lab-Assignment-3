class ShopeePay implements PaymentMode {
    @Override
    public double determineDiscount(double totalPrice) {
        return 0.10 * totalPrice;
    }
}