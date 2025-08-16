public class CreditCard implements Payable {
    private String cardNumber;

    // contructor
    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // getter cardNumber
    public String getCardNumber() {
        return cardNumber;
    }

    // setter cardNumber
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // polymorphism
    @Override
    public String getPaymentDetails() {
        String last4;
        if (cardNumber.length() >= 4) {
            last4 = cardNumber.substring(cardNumber.length() - 4);
        } else {
            last4 = cardNumber;  // kalau kurang dari 4, ambil semua
        }
        return "Credit Card ending in: " + "*".repeat(cardNumber.length() - 4) + last4;
    }

    @Override
    public double pay(double amount) {
        return amount;
    }
}
