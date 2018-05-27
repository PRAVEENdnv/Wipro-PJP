/*
 Intialize a character variable in a program and if the value is alphabet then print "Alphabet" if it’s a number then print "Digit" and for other characters print "Special Character"

*/

class Prog5 {
    public static void main(String[] args) {
        char a = args[0].charAt(0);
        if (Character.isLetter(a)) System.out.println("Alphabet");
        else if (Character.isDigit(a)) System.out.println("Digit");
        else System.out.println("Special Character");
    }
}