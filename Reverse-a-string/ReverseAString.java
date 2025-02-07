// Problem Statement: Write a function to reverse a string in-place.
// ○​ Example:​
// Input: s = "hello"​
// Output: "olleh"
// ○​ DSA Topic: Strings, Two Pointers
// ○​ Explanation: Use two pointers (one at the start and one at the end) to
// swap characters until the entire string is reversed.

public class ReverseAString {

    static String reverse(String str){
        int i = str.length() - 1;
        String newstr = "";
        while (i >= 0) {
            newstr = newstr + str.charAt(i);
            i--;
        }
        return newstr;
    }
    public static void main (String [] args ){
        String s = "hello" ;
        System.out.println("Reverse of the string " + s + " is " + reverse(s));
    }
}
