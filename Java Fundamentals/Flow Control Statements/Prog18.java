/*
Write a Java program to find if the given number is palindrome or not

Example1:

     C:\>java Sample 110011

     O/P Expected : 110011 is a palindrome

Example2:

     C:\>java Sample 1234

     O/P Expected : 1234 is not a palindrome
*/

class Prog18 {
    int reverse(int n) {
        int num = 0;
        while (n != 0) {
            int r = n % 10;
            num = num * 10 + r;
            n /= 10;
        }
        return num;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if (new Prog17().reverse(a) == a) System.out.println(a + " is a palindrome");
        else System.out.println(a + " is not a palindrome");
    }
}