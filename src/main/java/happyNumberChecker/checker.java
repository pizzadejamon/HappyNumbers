
package happyNumberChecker;


public class checker {
    
    static public boolean isHappy(int number){
  
        //Abbruchbedingungen
        if(number < 1)
            return false; //Fail Fast
        
        while((number = getDigitSquareSum(number)) != 1){
            if(number == 4) //Unendliche Schleife erkannt
                return false;
        }
        return true; //Zahl ist Happy
    }
    
    static public int getDigitSquareSum(int number){
        if(number < 0)
            return -1; //Fail Fast
        
        char[] digits = String.valueOf(number).toCharArray();
        int summe = 0;
        for(int i = 0; i < digits.length; i++){
            int digit = Character.getNumericValue(digits[i]);
            summe += digit * digit;
        }
        return summe;
    }
    
}
