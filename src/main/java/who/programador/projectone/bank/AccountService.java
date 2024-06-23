package who.programador.projectone.bank;


public class AccountService {
    private Double balance;

    public AccountService(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double value) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Double withdraw(Double value) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
