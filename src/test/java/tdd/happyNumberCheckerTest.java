
package tdd;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class happyNumberCheckerTest {
    
    @Test
    public void testIsHappyChecker(){
        
        //Teste Äquivalenzklassen
        assertFalse(happyNumberChecker.checker.isHappy(5));
        assertTrue(happyNumberChecker.checker.isHappy(10));
        assertTrue(happyNumberChecker.checker.isHappy(49));
        
        assertFalse(happyNumberChecker.checker.isHappy(-1));
        
        //Teste Grenzfälle
        assertFalse(happyNumberChecker.checker.isHappy(0));
        
        //Teste Intuitive Testfälle
        assertFalse(happyNumberChecker.checker.isHappy(999999999));
        
    }
    
    @Test
    public void testGetSum(){
        //Teste Äquivalenzklassen
        assertEquals(happyNumberChecker.checker.getDigitSquareSum(1), 1);
        assertEquals(happyNumberChecker.checker.getDigitSquareSum(11), 2);
        assertEquals(happyNumberChecker.checker.getDigitSquareSum(25), 29);
        
        assertEquals(happyNumberChecker.checker.getDigitSquareSum(-14), -1);
        
        //Teste Grenzfälle
        assertEquals(happyNumberChecker.checker.getDigitSquareSum(0), 0);
    }
}
    

