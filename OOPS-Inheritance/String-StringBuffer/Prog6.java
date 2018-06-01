/*
 Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0). If input is "hi" and "hello", then output will be "hihellohi".
*/

class Prog6 {
    public static void main(String[] args) {
        String s1 = "",s2 = "";
        try {
            s1 = args[0];
            s2 = args[1];
        }
        catch(Exception e) { System.out.println("Enter two string arguments"); }
        String temp;
        if (s1.length() > s2.length()) temp = s2+s1+s2;
        else temp = s1+s2+s1;
        System.out.println(temp);
    }
}