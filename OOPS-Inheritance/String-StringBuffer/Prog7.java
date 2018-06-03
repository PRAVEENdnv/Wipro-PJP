/*
 Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged. If the input is "xHix", then output is "Hi".
*/

class Prog7 {
    public static void main(String[] args) {
        String s = "";
        try {
            s = args[0];
        }
        catch (Exception e) { System.out.println("Enter a string argument"); }
        if (s.charAt(0) == 'x' && s.charAt(s.length() - 1) == 'x') s = s.substring(1, s.length() - 1);
        System.out.println(s);
    }
}