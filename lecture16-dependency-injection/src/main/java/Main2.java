import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main2 {
    public static void main(String[] args) {
        CreditCardProcessor processor = new PaypalCreditCardProcessor();
        InMemoryTransactionLog transactionLog = new InMemoryTransactionLog();
        BillingService billingService = new RealBillingService2(processor, transactionLog);

        // do useful things with billingService
    }
}
