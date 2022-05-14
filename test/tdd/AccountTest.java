//package tdd;
//
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class AccountTest {
//
//    @Test
//    public void testThatAccountIsNotNull(){
//        Account account = null;
//        assertNull(account);
//        account =  new Account("John", "fds", "jhgfds", "9876");
//        assertNotNull(account);
//        assertEquals("John", account.getFirstName());
//    }
//
//    @Test
//    @DisplayName("Test that I can set first name after initialization")
//    public void testThatFirstNameCanBeaddSet(){
//        // Given
//        Account account = new Account("24356", "sdfg", "kjhgfds","8765");
//        assertEquals("Jane", account.getFirstName());
//
//        // when
//        account.setFirstName("Esther");
//
//        // assert
//        assertEquals("Esther", account.getFirstName());
//    }
//
//    @Test
//    public void testThatDepositCanBeSet(){
//        // given
//        Account account = new Account("24356", "sdfg", "kjhgfds","8765");
//        assertEquals(0.0, account.getBalance("76543"));
//
//        // when
//        account.deposit(5500.50);
//
//        // assert
//        assertEquals(5500.50, account.getBalance());
//    }
//
//    @Test
//    public void testThatDepositCanBeSetTwice(){
//        // given
//        Account account = new Account("Joan");
//        assertEquals(0.0, account.getBalance());
//
//        // when
//        account.deposit(5500.50);
//        account.deposit(500);
//
//        // assert
//        assertEquals(6000.50, account.getBalance());
//    }
//
//
//    @Test
//    public void testThatNegativeAmountCannotBeImplemented(){
//        Account account = new Account("Remi");
//
//        //when
//    account.deposit(-56);
//
//    //assert
//    assertEquals(0.0, account.getBalance());
//    }
//
//    @Test
//    public void testThatWithdrawalCanBeCarriedOut(){
//       //given
//        Account account = new Account("tola");
//        account.getBalance();
//        // when
//        account.deposit(300);
//        account.withdrawal(200.0);
//
//        //assert
//        assertEquals(100, account.getBalance());
//    }
//
//    @Test
//    public void testThatWithdrawalCannotExceedBalance(){
//        //given
//        Account account = new Account("tola");
//        account.getBalance();
//        // when
//        account.deposit(300);
//        account.withdrawal(400.0);
//
//        //assert
//        assertEquals(300, account.getBalance());
//    }
//
//    @Test
//    public void testThatAccountCannotWithdrawAtZeroBalance(){
//        Account account = new Account("Obinna");
//        account.getBalance();
//
//        //When
//        account.withdrawal(-45);
//
//        //assert
//        assertEquals(0, account.getBalance());
//
//    }
//
//    }
