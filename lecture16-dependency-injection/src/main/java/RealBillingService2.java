public class RealBillingService2 implements BillingService{
    private final CreditCardProcessor processor;
    private final TransactionLog transactionLog;

    public RealBillingService2(CreditCardProcessor processor,
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
