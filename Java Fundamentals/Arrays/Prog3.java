/*
 Write a program to initialize an integer array with values and check if a given number is present in the array or not. If the number is not found, it will print -1 else it will print the index value of the given  number in the array
Ex1) Array elements are  {1,4,34,56,7} and the search element is 90
O/P: -1
Ex2)Array elements are  {1,4,34,56,7} and the search element is 56
O/P: 4 
*/

class Prog3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int arr[] = {5,1,2,9,16,20,25};
        System.out.println("Enter key to search:");
        int key = sc.nextInt();
        boolean flag = false;
        for (int i = 0;i < arr.length;i++) {
            if (key == arr[i]) {
                System.out.println(i);
                flag = true;
                break;
            }
        }
        if (flag == false) System.out.println(-1);
    }
}