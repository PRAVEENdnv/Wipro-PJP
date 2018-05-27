/*
Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *



Example1:

     C:\>java Sample 

     O/P Expected : Please enter an integer number

Example1:

     C:\>java Sample 3

     O/P Expected :
                   *
                   *  *
                   *  *  *
*/

class Prog16 {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = Integer.parseInt(args[0]);
        }
        catch(Exception e) {
            System.out.println("Please enter an integer number");
        }
        
        for (int i = 1;i <= a;i++) {
            int j = 1;
            while(j <= i) {
                System.out.print("*  ");
                j++;
            }
            System.out.println();
        }
    }
}