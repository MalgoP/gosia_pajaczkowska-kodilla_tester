package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);
    private int walletBalance;

    public WalletSteps() {
        Given("I have deposited ${int} in my wallet", (Integer amount) -> {
        //    Wallet wallet = new Wallet();
            int balance  = wallet.getBalance();
            wallet.deposit(amount);
            Assert.assertEquals("Incorrect wallet balance",amount.intValue()+balance, wallet.getBalance());
        });

        When("I request ${int}", (Integer amount) -> {
            cashier.withdraw(wallet, amount);
        });

        Then("${int} should be dispensed", (Integer amount) -> {
            Assert.assertEquals(amount.intValue(), cashSlot.getContents());
        });

        Then("the balance of my wallet should be ${int}", (Integer amount) -> {
            Assert.assertEquals("Incorrect wallet balance", amount.intValue(),  wallet.getBalance());
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("I should be told that {string}", (String expectedMessage) -> {
            Assert.assertEquals("Incorrect message from the cashier",expectedMessage, cashier.getMessage());
        });

        When("I check the balance of my wallet", () -> {
            walletBalance = wallet.getBalance();
        });

        Then("I should see that the balance is ${int}", (Integer amount) -> {
            Assert.assertEquals("Incorrect wallet balance",amount.intValue(),  walletBalance);
        });
    }
}