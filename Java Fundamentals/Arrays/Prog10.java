/*
Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.

Example1:

     C:\>java Sample 1 2 3

     O/P Expected : Please enter 4 integer numbers

Example2:

     C:\>java Sample 1 2 3 4

     O/P Expected : 
     
  The given array is :
  1 2 
  3 4 
  The reverse of the array is :
  4 3 
  2 1
*/

class Prog10 {
	public static void main(String[] args) {
		int arr[][] = new int[2][2];
		if (args.length < 4) {
			System.out.println("Please enter 4 integer numbers.");
			return;
		}
		int k = 0;
		for(int i = 0;i < 2;i++) for(int j = 0;j < 2;j++) arr[i][j] = Integer.parseInt(args[k++]);
		System.out.print(arr[1][1] + " ");
		System.out.println(arr[1][0]);
		System.out.print(arr[0][1] + " ");
		System.out.println(arr[0][0]);
	}
}