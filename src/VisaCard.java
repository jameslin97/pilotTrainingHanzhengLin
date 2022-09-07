public class VisaCard extends CreditCard{

    public VisaCard(String name, String nums, String type, double balance) {
        super();
        super.holdername = name;
        super.cardnumber = nums;
        super.cardType = "Visa";
        super.accountBalance = balance;
    }

    boolean isCardAccepted(String cardType){
        if (cardType.equals("Visa")){
            return true
        }
        return false;
    }

    public static void main(String[] args){
        CreditCard chase = new VisaCard("lin","112233","Visa","999.0");
        chase.paybill(100.0);
        System.out.println(chase.accountBalance);
    }
}
