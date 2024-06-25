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
        balance += value;
    }

    public Double withdraw(Double value) {
        if (value <= balance){
            balance -= value;
        }else {
            return 0.0;
        }
        return value;
    }
}
