package who.programador.projectone.store;

import org.junit.Test;

public class StoreServiceTest {
    @Test
    public void testIsEligibleForLoan() {
        StoreService storeService = new StoreService();
        assert storeService.isEligibleForLoan(18, 30000, true);
    }

    @Test
    public void testIsEligibleForLoanFalseByAge() {
        StoreService storeService = new StoreService();
        assert !storeService.isEligibleForLoan(17, 30000, true);
    }

    @Test
    public void testIsEligibleForLoanFalseByIncome() {
        StoreService storeService = new StoreService();
        assert !storeService.isEligibleForLoan(18, 29999, true);
    }

    @Test
    public void testIsEligibleForLoanFalseByCredit() {
        StoreService storeService = new StoreService();
        assert !storeService.isEligibleForLoan(18, 30010, false);
    }

    @Test
    public void testApplyDiscountRegular() {
        StoreService storeService = new StoreService();
        assert storeService.applyDiscount(100, "Regular") == 100;
    }

    @Test
    public void testApplyDiscountSilver() {
        StoreService storeService = new StoreService();
        assert storeService.applyDiscount(100, "Silver") == 90;
    }

    @Test
    public void testApplyDiscountGold() {
        StoreService storeService = new StoreService();
        assert storeService.applyDiscount(100, "Gold") == 80;
    }

    @Test
    public void testApplyDiscountPlatinum() {
        StoreService storeService = new StoreService();
        assert storeService.applyDiscount(100, "Platinum") == 70;
    }
}
