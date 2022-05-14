package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountRenameTest {
    private Account account;
    @BeforeEach
    public  void setUp(){
        account = new Account("1213", "fwyhgdu", "gSYGUSJ", "1212");
    }

    @Test
    public void testThatAccountCanBeCreated(){
        assertNotNull(account);
    }

    @Test
    public void testThatAccountCanBeCreatedWithAllDetails(){
        assertEquals("1212", account.getACCOUNT_NUMBER());
        assertEquals("funi remilekun", account.getAccountName());
    }

    @Test
    public void testThatAccountTest(){

        account.deposit(400);
        assertEquals(400, account.getBalance("9090"));
    }


}
