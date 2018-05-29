/*
Write a program to find greatest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.


Example1:

     C:\>java Sample 1 2 3

     O/P Expected : Please enter 9 integer numbers

Example2:

     C:\>java Sample 1 23 45 55 121 222 56 77 89

     O/P Expected : 
The given array is :
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is 222
*/

class Prog11 {
	public static void main(String[] args) {
		if (args.length < 9) {
			System.out.println("Please enter 9 integer numbers.");
			return;
		}
		int max = 0;
		for (String i:args) {
			int a = Integer.parseInt(i);
			if (max < a) max = a;
		}
		System.out.println("The given array is: ");
		for (int i = 0,j = 0;i < 9;i++, j++) {
			if (j == 3) {
				System.out.println();
				j = 0;
			}
			System.out.print(args[i] + " ");
		}
		System.out.println("\nThe biggest number in the given array is: " + max);
	}
}