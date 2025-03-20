import java.util.UUID;


public class payment {
    public enum paymentMethod{
        CASH,
        BTC,
        ETH,
        PAYPAL,
        APPLEPAY,
        GOOGLEPAY,
        HAWKTUAH
    }
    public enum paymentStatus{
        PENDING,
        APPROVED,
        REJECTED,
    }
    UUID id;
    Guest payer;
    float amount;
    paymentStatus paymentStatus;
    paymentMethod paymentMethod;

    public void processPayment() {
        if(paymentStatus == paymentStatus.APPROVED) {
            System.out.println("Approved!Chaching.");
        }
        else if(paymentStatus == paymentStatus.REJECTED) {
            System.out.println("Rejected!");
        }
    }
}
