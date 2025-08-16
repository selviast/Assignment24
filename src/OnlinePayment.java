abstract class OnlinePayment implements Payable {
    private String transactionId;

    // getter transactionId
    public String getTransactionId() {
        return transactionId;
    }

    //setter transactionId
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    // polymorphism
    @Override
    public abstract String getPaymentDetails();

}
