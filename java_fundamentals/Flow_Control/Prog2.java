/*
 Write a program to check if a given number is odd or even.

*/

class Prog2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if (a % 2 != 0) System.out.println("Odd");
        else System.out.println("Even");
    }
}