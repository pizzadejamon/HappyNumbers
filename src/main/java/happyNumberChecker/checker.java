
package happyNumberChecker;


public class checker {
    
    static public boolean isHappy(int number){
  
        //Abbruchbedingungen
        if(number < 1)
            return false;
        
        while(number != 1){
            char[] digits = String.valueOf(number).toCharArray();
            int summe = 0;
            for(int i = 0; i < digits.length; i++){
               int digit = Character.getNumericValue(digits[i]);
               summe += digit * digit;
            }
            number = summe;
            if(number == 4)
                return false;
        }
        return true;
    }
    
}
