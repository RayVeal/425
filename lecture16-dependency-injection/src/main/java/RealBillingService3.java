import com.google.inject.Inject;

public class RealBillingService3 implements BillingService{
    private final CreditCardProcessor processor;
    private final TransactionLog transactionLog;

    @Inject
    public RealBillingService3(CreditCardProcessor processor,
                               TransactionLog transactionLog) {
        this.processor = processor;
        this.transactionLog = transactionLog;
    }

    public String chargeOrder(PizzaOrder order, CreditCard creditCard) {
        ChargeResult result = processor.charge(creditCard, order.getAmount());
        transactionLog.logChargeResult(result);

        return "charged " + order.getAmount();
    }
}
