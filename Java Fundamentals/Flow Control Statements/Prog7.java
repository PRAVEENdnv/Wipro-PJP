/*
 Write a program to convert from upper case to lower case and vice versa of an alphabet and print the old character and new character as shown in example (Ex: a->A, M->m).
*/

class Prog7 {
    public static void main(String[] args) {
        char a = args[0].charAt(0);
        if (Character.isUpperCase(a)) System.out.println(a + "->" + Character.toLowerCase(a));
        else System.out.println(a + "->" + Character.toUpperCase(a));
    }
}