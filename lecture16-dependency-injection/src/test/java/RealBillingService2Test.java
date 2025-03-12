import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RealBillingService2Test {

    private final InMemoryTransactionLog transactionLog = new InMemoryTransactionLog();

    //fake for testing
    private final FakeCreditCardProcessor processor = new FakeCreditCardProcessor();

    @Test
    public void testSuccessfulCharge() {
        PizzaOrder order = new PizzaOrder(100);
        CreditCard creditCard = new CreditCard("1234", 11, 2010);
        RealBillingService2 billingService
                = new RealBillingService2(processor, transactionLog);
        String receipt = billingService.chargeOrder(order, creditCard);

        assertEquals(receipt, "charged 100.0");
    }
}
