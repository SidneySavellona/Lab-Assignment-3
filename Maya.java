class Maya implements PaymentMode {
    @Override
    public double determineDiscount(double totalPrice) {
        return 0.05 * totalPrice;
    }
}