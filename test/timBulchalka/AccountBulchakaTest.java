package timBulchalka;

import org.junit.jupiter.api.Test;
import timBuchalka.AccountBulchaka;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountBulchakaTest {
    @Test
    public void bankAccountClassExistsTest() {
        AccountBulchaka accountBulchaka = new AccountBulchaka();
        assertNotNull(accountBulchaka);
    }

    @Test
    public void bankAccountHasAccountNumberTest(){
        AccountBulchaka accountBulchaka = new AccountBulchaka();
        accountBulchaka.setAccountNumber("1111");
        assertEquals("1111", accountBulchaka.getAccountNumber());
    }

    @Test
    public void accountNumberCanNotBeNullTest(){
        AccountBulchaka accountBulchaka = new AccountBulchaka();
        accountBulchaka.setAccountNumber("");
        assertEquals(null, accountBulchaka.getAccountNumber());
    }

    @Test
    public void accountHasNameTest(){
        AccountBulchaka accountBulchaka = new AccountBulchaka();
        accountBulchaka.setAccountName("derin");
        assertEquals("derin", accountBulchaka.getAccountName());
    }


    @Test
    public void accountNameCannotBeNullTest(){
        AccountBulchaka accountBulchaka = new AccountBulchaka();
        accountBulchaka.setAccountName("");
        assertEquals(null, accountBulchaka.getAccountName());

    }

    @Test
    public void accountHasBalanceTest(){
        AccountBulchaka accountBulchaka = new AccountBulchaka();
        accountBulchaka.setAccountBalance(100.0);
        assertEquals(100.0, accountBulchaka.getAccountBalance());
    }

    @Test
    public void accountHasEmailTest(){
        AccountBulchaka accountBulchaka = new AccountBulchaka();
        accountBulchaka.setAccountEmail("derin@gmail.com");
        assertEquals("derin@gmail.com", accountBulchaka.getAccountEmail());
    }

    @Test
    public void accountCanDepositTest(){
        AccountBulchaka accountBulchaka = new AccountBulchaka();
        accountBulchaka.deposit(200);
        assertEquals(200, accountBulchaka.getAccountBalance());
    }

    @Test
    public void accountCanTakeMultipleDepositsTest(){
        AccountBulchaka accountBulchaka = new AccountBulchaka();
        accountBulchaka.deposit(200);
        accountBulchaka.deposit(200);
        accountBulchaka.deposit(200);
        assertEquals(600, accountBulchaka.getAccountBalance());
    }

    @Test
    public void accountCanWithdrawTest(){
        AccountBulchaka accountBulchaka = new AccountBulchaka();
        accountBulchaka.withdraw(200);
        assertEquals(0, accountBulchaka.getAccountBalance());
    }

    @Test
    public void accountCanDoMultipleWithdrawTest(){
        AccountBulchaka accountBulchaka = new AccountBulchaka();
        accountBulchaka.deposit(2000);
        accountBulchaka.withdraw(200);
        accountBulchaka.withdraw(200);
        accountBulchaka.withdraw(200);
        accountBulchaka.withdraw(200);
        accountBulchaka.withdraw(200);
        assertEquals(1000, accountBulchaka.getAccountBalance());
    }

    @Test
    public void accountCanNotWithdrawNegativeValuesTest(){
        AccountBulchaka accountBulchaka = new AccountBulchaka();
        accountBulchaka.deposit(2000);
        accountBulchaka.withdraw(-200);
        assertEquals(2000, accountBulchaka.getAccountBalance());
    }

    @Test
    public void accountCanNotWithdrawIfBalanceIsZeroTest(){
        AccountBulchaka accountBulchaka = new AccountBulchaka();

        accountBulchaka.withdraw(200);
        assertEquals(0, accountBulchaka.getAccountBalance());
    }

    @Test
    public void accountCanNotWithdrawIfBalanceIsGreaterThanAmountTest(){
        AccountBulchaka accountBulchaka = new AccountBulchaka();
        accountBulchaka.deposit(200);
        accountBulchaka.deposit(800);
        accountBulchaka.withdraw(1005);
        assertEquals(1000, accountBulchaka.getAccountBalance());
    }

}
