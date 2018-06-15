/*
Write a class MathOperation which accepts integers from command line. Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements. 
Display the result. 
Check for various exceptions that may arise like ArithmeticException, NumberFormatException, and so on.
For example: The class would be invoked as follows: 
C:>java MathOperation 1900, 4560, 0, 32500
*/

class Prog4 {
    public static void main(String[] args) {
        if (args.length <= 0) {
            System.out.println("Enter integer arguments!");
            return;
        }
        int sum = 0;
        try {
            for (String i:args) {
                sum += Integer.parseInt(i);
            }   
        }
        catch (Exception e) {
            System.out.println(e.getClass().getCanonicalName());
            return;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (sum/args.length));
    }
}