/*
 Given two strings, append them together (known as concatenation) and return the result. However, if the concatenation creates a double-char, then omit one of the chars. If the inputs are Mark and Kate then the ouput should be markate. (The output should be in lowercase)
*/

class Prog2 {
    public static void main(String[] args) {
        String s0 = "",s1 = "";
        try {
            s0 = args[0];
            s1 = args[1];
        }
        catch(Exception e) { System.out.println("Enter two String arguments"); }
        s0 = s0.toLowerCase();
        s1 = s1.toLowerCase();
        if (s0.charAt(s0.length() - 1) == s1.charAt(0)) s0 = s0.substring(0, s0.length() - 1);
        System.out.println(s0+s1);
    }
}