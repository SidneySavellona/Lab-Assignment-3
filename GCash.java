class GCash implements PaymentMode {
    @Override
    public double determineDiscount(double totalPrice) {
        return 0;
    }
}