/*
 Write a program to check if a given number is prime or not
*/

class Prog12 {
    boolean isPrime(int n) {
        if (n <= 1) return false;
        else {
            for (int i = 2;i <= n/2;i++) {
                if (n % i == 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        Prog12 obj = new Prog12();
        if (obj.isPrime(a)) System.out.println(a + " is a prime number.");
        else System.out.println(a + " is not a prime number.");
    }
}