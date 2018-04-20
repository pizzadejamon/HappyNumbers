
package tdd;

import happyNumberChecker.checker;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public class happyNumberCheckerTest {
    
    @Test
    public void testIsHappyChecker(){
        
        //Teste Äquivalenzklassen
        assertFalse(happyNumberChecker.checker.isHappy(5));
        assertTrue(happyNumberChecker.checker.isHappy(10));
        
        assertNull(happyNumberChecker.checker.isHappy(-1));
        
        //Teste Grenzfälle
        assertNull(happyNumberChecker.checker.isHappy(0));
        
        //Teste Intuitive Testfälle
        assertNull(happyNumberChecker.checker.isHappy(999999999));
        
    }
    
}
