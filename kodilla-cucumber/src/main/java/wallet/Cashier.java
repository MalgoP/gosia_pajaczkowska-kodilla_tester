package wallet;

public class Cashier {
    private CashSlot cashSlot;
    private String message = "";
    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if(wallet.getBalance()>=amount) {
            wallet.debit(amount);
            cashSlot.dispense(amount);
            message = "Withdraw successful";
        }else{
            message = "Not enough funds in the wallet";
        }
    }

    public String getMessage() {
        return message;
    }
}