package who.programador.projectone.store;

public class StoreService {

    /**
     * This method checks whether a customer is eligible for a loan based on age, annual income and credit history.
     * The logic could be, for example, that the customer must be of legal age(18),
     * have a minimum annual income of 30,000 and a good credit history.
     */
    public boolean isEligibleForLoan(int age, double annualIncome, boolean hasGoodCredit) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * This applies a discount to a purchase based on the customer's category. The logic might be that "Regular"
     * customers receive no discount, "Silver" customers receive a 10% discount, "Gold" customers receive a 20% discount
     * and "Platinum" customers receive a 30% discount.
     */
    public double applyDiscount(double purchaseAmount, String customerCategory) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
