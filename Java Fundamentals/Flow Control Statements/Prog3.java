/*
 Write a program to check if the program has received command line arguments or not. If the program has not received the values then print "No Values", else print all the values in a single line separated by ,(comma).
Eg1) java Example
O/P: No values
Eg2) java Example Mumbai Bangalore
O/P: Mumbai,Bangalore
[Note: You can use length property of an array to check its length

*/

class Prog3 {
    public static void main(String[] args) {
        int l = args.length;
        if (l > 0) {
            for (int i = 0; i < l; i++) {
                if (i == l - 1) System.out.print(args[i]);
                else System.out.print(args[i] + ",");
            }
            System.out.println();
        }
        else {
            System.out.println("No values");
        }
    }
}