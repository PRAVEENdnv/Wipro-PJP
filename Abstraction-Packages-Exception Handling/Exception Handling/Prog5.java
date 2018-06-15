/*
Write a Program with a division method who receives two integer numbers and performs the division operation. The method should declare that it throws ArithmeticException. This exception should be handled in the main method.
*/

class Prog5 {
    public double divide(int a, int b) throws ArithmeticException {
        return a/b;
    }

    public static void main(String[] args) {
        if (args.length <= 0) {
            System.out.println("Enter integer arguments!");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        try {
            System.out.println("The quotient is: " + new Prog5().divide(a,b));
        }
        catch (ArithmeticException e) {
            System.out.println(e.getClass().getCanonicalName());
            return;
        }
    }
}