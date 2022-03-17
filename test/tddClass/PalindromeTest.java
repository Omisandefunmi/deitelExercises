package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeTest {

    @Test
    public void testIfNumberIsPalindrome(){
        Palindrome chibuzo = new Palindrome();
        chibuzo.getIsPalindrome();

        assertEquals(false, chibuzo.getIsPalindrome());

    }

   /*  @Test
    public void testPalindrome(){
        Palindrome chibuzo = new Palindrome();
        int result = chibuzo.isPalindrome;

    */
    }

