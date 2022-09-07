public abstract class CreditCard {
    String holderName;
    String cardNumber;
    double accountBalance;
    String cardType;

    public CreditCard{
        abstract boolean isCardAccepted(String cardType)
    }

    public void payBill(double bill){
        this.accountBalance = this.accountBalance - bill;
    }

    public void payBills(int bill){
        accountBalance -= (double) bill;
    }

}
