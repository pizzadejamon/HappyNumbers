
package tdd;

import happyNumberChecker.checker;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

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
    
}
