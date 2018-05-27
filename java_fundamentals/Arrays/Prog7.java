/*
Write a program to remove the duplicate elements in an array and print
Eg) Array Elements--12,34,12,45,67,89
O/P: 12,34,45,67,89
*/
import java.util.*;

class Prog7 {
    public static void main(String[] args) {
        int arr[] = {12,34,12,45,67,89};
        Set<Integer> set = new HashSet<Integer>();
        for (int i:arr) set.add(i);
        Iterator it = set.iterator();
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();
    }
}