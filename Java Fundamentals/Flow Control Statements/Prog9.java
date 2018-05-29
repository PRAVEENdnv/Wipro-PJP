/*
 Write a program to print month in words, based on input month in numbers
Example1:

     C:\>java Sample 12

     O/P Expected : December

Example2:

     C:\>java Sample 

     O/P Expected : Please enter the month in numbers

Example3:

     C:\>java Sample 15

     O/P Expected : Invalid month
*/

class Prog9 {
    public static void main(String[] args) {
        String month[] = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int a = 0;
        try {
            a = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e) {
            System.out.println("Please enter the month in numbers");
            return;
        }
        if (a > 12) System.out.println("Invalid month");
        else System.out.println(month[a]);
    }
}