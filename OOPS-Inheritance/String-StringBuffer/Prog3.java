/*
Given a string, return a new string made of n copies of the first 2 chars of the original string where n is the length of the string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
If input is "Wipro" then output should be "WiWiWiWiWi".
*/

class Prog3 {
    public static void main(String[] args) {
        String s = "";
        int n = 0;
        try { 
            s = args[0];
            n = Integer.parseInt(args[1]);        
        }
        catch (Exception e) { System.out.println("Enter a string and integer argument."); }
        if (s.length() >= 2) s = s.substring(0,2);
        String temp = "";
        while (n-- != 0) temp += s;
        System.out.println(temp); 
    }
}