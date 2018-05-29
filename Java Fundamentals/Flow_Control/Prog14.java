/*
Write a Java program to find if the given number is prime or not.

Example1:

     C:\>java Sample 

     O/P Expected : Please enter an integer number 

Example2:

     C:\>java Sample 1

     O/P Expected : 1 is neither prime nor composite

Example3:

     C:\>java Sample 0

     O/P Expected : 0 is neither prime nor composite
 
 Example4:

     C:\>java Sample 10

     O/P Expected : 10 is not a prime number

Example5:

     C:\>java Sample 7

     O/P Expected : 7 is a prime number
*/

class Prog14 {
    int isPrime(int n) {
        if (n <= 1) return 1;
        else {
            for (int i = 2;i <= n/2;i++) {
                if (n % i == 0) return 2;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Prog13 obj = new Prog13();
        int a = 0;
        try {
            a = Integer.parseInt(args[0]);
        }
        catch (Exception e) {
            System.out.println("Please enter an integer number");
            return;
        }
        int i = obj.isPrime(a);
        if (i == 1) System.out.println(a + " is neither prime nor composite");
        else if (i == 2) System.out.println(a + " is not a prime number");
        else System.out.println(a + " is a prime number");
    }
}