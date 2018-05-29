/*
 Write a program to print prime numbers between 10 and 99.
*/

class Prog13 {
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
        Prog13 obj = new Prog13();
        for (int i = 11;i <= 97;i++) {
            if (obj.isPrime(i)) System.out.println(i);
        }
    }
}