public class PayPal implements Payable {
    private String email;

    // constructor
    public PayPal(String email) {
        this.email = email;
    }

    // getter email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // polymorphism
    @Override
    public String getPaymentDetails() {
        return "Paypal email : " + email;
    }

    @Override
    public double pay(double amount) {
        return amount;
    }
}
