/*
Given two strings, word and a separator, return a big string made of count occurrences of the word, separated by the separator string.
if the inputs are "Wipro","X" and 3 then the output is "WiproXWiproXWipro".
*/

class Prog8 {
    public static void main(String[] args) {
        String s = "";
        char delim = '0';
        int count = 0;
        try {
            s = args[0];
            delim = args[1].charAt(0);
            count = Integer.parseInt(args[2]);
            if (count == 0) {
                System.out.println("Enter a non-zero integer.");
                return;
            }
        }
        catch (Exception e) { 
            System.out.println("Enter a string, a character and an integer.");
            return;
        }
        String temp = "";
        while (--count != 0) {
            temp += s + delim;
        }
        temp += s;
        System.out.println(temp);
    }
}