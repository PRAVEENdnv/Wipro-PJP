/*
 Write a program to initialize an integer array and find the maximum and minimum value of an array
*/

class Prog2 {
    public static void main(String[] args) {
        int arr[] = {10,1,4,12,3};
        int max = 0, min = Integer.MAX_VALUE;
        for (int i = 0;i < arr.length;i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("The maximum value is: " + max);
        System.out.println("The minimum value is: " + min);
    }
}