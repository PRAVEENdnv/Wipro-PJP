/*
 Write a program to add all the values in a given number and print. Ex: 1234->10
*/

class Prog15 {
    int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum += r;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Prog15 obj = new Prog15();
        int a = Integer.parseInt(args[0]);
        System.out.println(obj.sumOfDigits(a));
    }
}