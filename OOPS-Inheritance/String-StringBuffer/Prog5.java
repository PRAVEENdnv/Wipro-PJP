/*
 Given a string, return a version without the first and last char, so "Wipro" yields "ipr". The string length will be at least 2.
*/

class Prog5 {
    public static void main(String[] args) {
        String s = "";
        try { s = args[0]; }
        catch(Exception e) { System.out.println("Enter a string argument"); }
        if (s.length() > 2) s = s.substring(1, s.length() - 1);
        System.out.println(s);
    }
}