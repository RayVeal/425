import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RealBillingService3Test {


    @Mock
    private TransactionLog transactionLog;
    @Mock
    private CreditCardProcessor processor;
    @InjectMocks
    private RealBillingService3 billingService;


    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSuccessfulCharge() {
        PizzaOrder order = new PizzaOrder(100);
        CreditCard creditCard = new CreditCard("1234", 11, 2010);
        String receipt = billingService.chargeOrder(order, creditCard);

        assertEquals(receipt, "charged 100.0");
    }
}
