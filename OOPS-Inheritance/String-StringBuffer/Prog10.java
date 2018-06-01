/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
If the inputs are "Hello" and "World", then the output is "HWeolrllod".
*/

class Prog10 {
    public static void main(String[] args) {
        String s1 = "", s2 = "";
        try {
            s1 = args[0];
            s2 = args[1];
        }
        catch (Exception e) {
            System.out.println("Enter 2 string arguments");
        }
        int l = s1.length() < s2.length() ? s1.length() : s2.length();
        String temp = "";
        for (int i = 0;i < l;i++) {
            temp += Character.toString(s1.charAt(i)) + Character.toString(s2.charAt(i));
        }
        if (l == s1.length()) temp += s2.substring(l);
        else temp += s1.substring(l);
        System.out.println(temp);
    }
}