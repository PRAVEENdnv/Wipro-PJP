/*
Write a program that displays a menu with options 1. Add 2. Sub
Based on the options chosen, read 2 numbers and perform the relevant operation. After performing the operation, the program should ask the user if he wants to continue. If the user presses y or Y, then the program should continue displaying the menu else the program should terminate.
[ Note: Use Scanner class, you can take help from the trainer regarding the same ]
*/
import java.util.Scanner;
class Prog20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0,a = 0, b = 0;
        char cont = '0';
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            System.out.println("Enter two numbers");
            a = sc.nextInt();
            b = sc.nextInt();
            switch(choice) {
                case 1: System.out.println(a + b);
                        break;
                case 2: System.out.println(a - b);
                        break;
            }
            System.out.print("Do you want to continue(Y/N)? ");
            cont = sc.next().charAt(0);
            if (cont == 'Y' || cont == 'y') continue;
            else break;
        }
    }
}