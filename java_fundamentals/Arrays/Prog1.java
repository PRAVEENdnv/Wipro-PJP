/*
 Write a program to initialize an integer array and print the sum and average of the array
*/

class Prog1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0;i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + sum/arr.length);
    }
}