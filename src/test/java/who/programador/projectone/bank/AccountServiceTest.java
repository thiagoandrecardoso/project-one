package who.programador.projectone.bank;

import org.junit.Test;

public class AccountServiceTest {
    @Test
    public void testDeposit() {
        AccountService accountService = new AccountService(0.0);
        accountService.deposit(100.0);
        assert accountService.getBalance() == 100.0;
    }

    @Test
    public void testWithdraw() {
        AccountService accountService = new AccountService(100.0);
        Double value = accountService.withdraw(50.0);
        assert value == 50.0;
        assert accountService.getBalance() == 50.0;
    }

    @Test
    public void testWithdrawInsufficientBalance() {
        AccountService accountService = new AccountService(100.0);
        Double value = accountService.withdraw(150.0);
        assert value == 0.0;
        assert accountService.getBalance() == 100.0;
    }
}
