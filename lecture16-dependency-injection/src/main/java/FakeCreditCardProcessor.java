public class FakeCreditCardProcessor extends CreditCardProcessor {
    @Override
    public ChargeResult charge(CreditCard cc, double amount) {
        return null;
    }
}
