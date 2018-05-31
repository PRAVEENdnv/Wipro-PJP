/*
 Given a string of even length, return the first half. So the string "CatDog" yields "Cat". If the string length is odd number then return null.
*/

class Prog4 {
    public static void main(String[] args) {
        String s = "";
        try { s = args[0]; }
        catch(Exception e) { System.out.println("Enter a string argument"); }
        int i = 1;
        while (!Character.isUpperCase(s.charAt(i))) i++;
        System.out.println(s.substring(0,i));
    }
}