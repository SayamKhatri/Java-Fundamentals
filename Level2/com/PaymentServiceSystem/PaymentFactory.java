package Level2.com.PaymentServiceSystem;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentFactory {
    static PaymentFactory instance = new PaymentFactory();
    private PaymentFactory(){}; // Private Constructor 
    private static int paymentCount;
    private static Map<String, Supplier<PaymentService>> map = new HashMap<>();

    public static PaymentFactory getInstance(){
        return instance;
    }

    public PaymentService payment(String type) {
        Supplier<PaymentService> kind =  map.get(type);
        paymentCount += 1;
        if (kind == null) {
            return new LogAndIgnorePayment();
        }

        return kind.get();
    }

    public void register(String type, Supplier<PaymentService> kind) {
        if (map.containsKey(type)){
            throw new IllegalStateException("This type is Already registered!");
        }
        map.put(type, kind);
    }

    public void overrideRegister(String type, Supplier<PaymentService> kind) {
        map.put(type, kind);
    }
    
    public void deregister(String type){
        map.remove(type);
    }

    public void listAvailableTypes(){
        for (Map.Entry<String, Supplier<PaymentService>> obj : map.entrySet()) {
            System.out.println(obj.getKey());
        }
    }

}
