public class RealBillingService implements BillingService {

    private CreditCardProcessor processor;
    private TransactionLog transactionLog;

    public RealBillingService() {
        this.processor = new PaypalCreditCardProcessor();
        this.transactionLog = new DatabaseTransactionLog();
    }

    public String chargeOrder(PizzaOrder order, CreditCard creditCard) {
        ChargeResult result = processor.charge(creditCard, order.getAmount());
        transactionLog.logChargeResult(result);

        return "charged " + order.getAmount();
    }
}