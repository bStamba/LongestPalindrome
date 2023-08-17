import java.util.ArrayList;

public class Solution {

    public String longestPalindrome(String s) {

        String largePalin = String.valueOf(s.charAt(0));
        String cString;
        String startLetter;

        System.out.println(largePalin);

        //If String is only 1 in length, then that is the longest palindrome.
        if(s.length() == 1){ return largePalin; }

        //Loop through the array starting with each letter in the string, adding the rest of the following
        //letters one by one and testing if those strings that are created are palindromes.
        //We will then set our largest palindrome if there is one and return it.
        for(int i = 0; i < s.length(); i++){
            startLetter = String.valueOf(s.charAt(i));
            cString = startLetter;
            //If largest palindrome hasn't been set, let's set it to the first letter.
            for(int j = i + 1; j < s.length(); j++){
                 cString = cString + s.charAt(j);
                //If the string is a palindrome, and longer than our current longest, that is our longest one.
                if(cString.equals(reverseString(cString)) && largePalin.length() < cString.length()){
                    largePalin = cString;
                }
            }
        }
        return largePalin;
    }

    public String reverseString(String s){
        String reversed = "";

        //Populate our string char by char starting from the end of s so that it ends up reversed.
        for(int i = s.length() - 1; i > -1; i--){
            reversed = reversed + s.charAt(i);
        }
        return reversed;
    }
}
