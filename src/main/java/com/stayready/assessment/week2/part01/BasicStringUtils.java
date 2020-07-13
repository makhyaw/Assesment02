package com.stayready.assessment.week2.part01;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        StringBuilder sb = new StringBuilder(string1);
        sb.reverse();
        return sb.toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        StringBuilder sb = new StringBuilder(string1);
        sb.reverse();
        String first = sb.toString();
        StringBuilder sb2 = new StringBuilder(string2);
        sb2.reverse();
        String second = sb2.toString();

        return first + second;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        StringBuilder result = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (charactersToRemove.indexOf(c) == -1) {
                result.append(c);
            }
        }
        return result.toString();
        

    } 
        
    
    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        StringBuilder result = new StringBuilder();
        for (char x : string.toCharArray()) {
            if (charactersToRemove.indexOf(x) == -1) {
                result.append(x);
                
            }
        }
        StringBuilder sb = new StringBuilder();
            result.reverse();
        
        
        return result.toString();
    }
}
