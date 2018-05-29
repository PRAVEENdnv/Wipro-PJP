/*
Write a program to reverse a given number and print
Eg1)
I/P: 1234
O/P:4321
Eg2)
I/P:1004
O/P:4001
*/

class Prog17 {
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
        System.out.println(new Prog17().reverse(a));
    }
}