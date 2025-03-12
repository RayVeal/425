import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main3 {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BillingModule());
        BillingService billingService = injector.getInstance(BillingService.class);

        // do useful things with billingService
    }
}
