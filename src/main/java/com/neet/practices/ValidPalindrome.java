package com.neet.practices;

public class ValidPalindrome {
    private static String s = "A man, a Plan, a canal, panama";
    private static int beginIndex = 0;
    private static int endIndex = s.length()-1;

    public static void main(String[] args) {
        System.out.println("The given String 's'  is "+isPalindrome(s)+"ly a palindrome");
    }

    private static boolean isPalindrome(String s) {
        while (endIndex >= beginIndex){
            Character initialChar = getbeginChar();
            Character finalChar = getEndChar();
            if(finalChar == initialChar){
                beginIndex++;
                endIndex--;
                continue;
            }else {
                return false;
            }

             //if(isEqual(,s.charAt(finalChar));
        }
        return true;
    }

    private static Character getEndChar() {
        Character finalChar = s.charAt(endIndex)  ;
        while( endIndex > beginIndex && !isAlphanumeric(finalChar)){
            endIndex --;
            finalChar = s.charAt(endIndex);
        }
        return Character.toLowerCase(finalChar);
    }

    private static Character getbeginChar() {
        Character initialChar = s.charAt(beginIndex)  ;
        while(beginIndex < endIndex && !isAlphanumeric(initialChar)){
            beginIndex ++;
            initialChar = s.charAt(beginIndex);
        }
        return Character.toLowerCase(initialChar);
    }

    private static boolean isAlphanumeric(Character charVal) {
        return Character.isAlphabetic(charVal) || Character.isDigit(charVal);
    }


   /*
   USUAL WAY
   **
    public static boolean isPalindrome(String s) {
        StringBuilder trimmedStr = new StringBuilder();
        for(Character  c : s.toCharArray()){
            if (Character.isAlphabetic(c) || Character.isDigit(c)){
                trimmedStr.append(c.toString().toLowerCase());
            }
        }
        return trimmedStr.equals(trimmedStr.reverse());
    }
   */

}
