/*
 Write a program to initialize an array and print them in a sorted fashion

*/

class Prog6 {
    public static void main(String[] args) {
        int arr[] = {5,10,49,16,2,1,21,32};
        java.util.Arrays.sort(arr);
        for (int i:arr) System.out.print(i + " ");
        System.out.println();
    }
}