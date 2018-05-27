/*
 Initialize two character variables in a program and display the characters in alphabetical order.
Eg1) if first character is s and second is e
O/P: e,s
Eg2) if first character is a and second is e
O/P:a,e

*/

class Prog4 {
    public static void main(String[] args) {
        char a = args[0].charAt(0);
        char b = args[1].charAt(0);
        if ((int)a < (int)b) System.out.println(a+","+b);
        else System.out.println(b+","+a);
    }
}