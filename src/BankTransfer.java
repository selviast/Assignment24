public class BankTransfer extends OnlinePayment {
    private String bankName;
    private String accountNumber;

    // getter bankName
    public String getBankName() {
        return bankName;
    }

    // setter bankName
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    // getter accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // setter accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // constructor
    public BankTransfer(String bankName, String accountNumber) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    // polymorphism
    @Override
    public String getPaymentDetails() {
        return "Bank Transfer: " + bankName + " - " + accountNumber;
    }

    @Override
    public double pay(double amount) {
        return amount;
    }
}
