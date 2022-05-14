package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ReceiptTest {
    private Receipt receipt;

    @BeforeEach
    public void setUp(){
        receipt = new Receipt();
    }

    @Test
    public void testThatReceiptCanBeCreated(){
        Receipt receipt = new Receipt();
        assertNotNull(receipt);

    }

    @Test
    public void testThatGetCustomerName(){
        receipt.getCustomerName("Funmi");
        assertEquals("Funmi",receipt.getCustomerName("Funmi"));

    }

    @Test
    public void customerWantsQuery(){
//        receipt.getCustomerWants(){

        }
    }


