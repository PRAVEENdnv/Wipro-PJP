/*
 Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array
*/

class Prog5 {
    public static void main(String[] args) {
        int arr[] = {5,10,49,16,2,1,21,32};
        java.util.Arrays.sort(arr);
        System.out.println("Two largest numbers: " + arr[arr.length - 1] + ", " + arr[arr.length - 2]);
        System.out.println("Two smallest numbers: " + arr[0] + ", " + arr[1]);
    }
}