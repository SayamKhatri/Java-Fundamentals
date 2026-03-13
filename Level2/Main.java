package Level2;
import Level2.com.PaymentServiceSystem.CreditCardPayment;
import Level2.com.PaymentServiceSystem.LogAndIgnorePayment;
import Level2.com.PaymentServiceSystem.NetBankingPayment;
import Level2.com.PaymentServiceSystem.PaymentFactory;
import Level2.com.PaymentServiceSystem.PaymentService;
import Level2.com.PaymentServiceSystem.PremiumPaymentFactory;
import Level2.com.PaymentServiceSystem.UPIPayment;
import Level2.com.PaymentServiceSystem.WalletPaymentMethod;

public class Main {
    public static void main(String[] args) {
        String[] paymentTypes = {"CREDIT CARD", "NET BANKING", "UPI", "PAYPAL", "CRYPTO", "WALLET"};
        // PaymentService[] ptypes = {new CreditCardPayment(), new UPIPayment()};
        
        // for (PaymentService paymentService : ptypes) {
        //     paymentService.processPayment(100, "Sam");
        // }

        PaymentFactory pf = PaymentFactory.getInstance();
        pf.register("WALLET", WalletPaymentMethod::new);
        pf.register("CREDIT CARD", CreditCardPayment::new);
        pf.register("UPI", UPIPayment::new);
        pf.register("NET BANKING", NetBankingPayment::new);
        pf.register("LOG", LogAndIgnorePayment::new);
        pf.listAvailableTypes();

        for (String type : paymentTypes) {
            PaymentService p = pf.payment(type);
            p.processPayment(100, "Sam");
            
        }
        
    }
}
