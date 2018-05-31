/*
 Write a Program that will check whether a given String is Palindrome or not
*/

class Prog1 {
    public static void main(String[] args) {
        try { StringBuffer sb = new StringBuffer(args[0]); }
        catch(Exception e) { System.out.println("Enter a string as argument"); }
        String rev = sb.toString();
        if (sb.reverse().toString().compareTo(rev) == 0) System.out.println(rev + " is a Palindrome");
        else System.out.println(rev + " is not a Palindrome");
    }
}