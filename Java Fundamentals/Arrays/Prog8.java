/*
Write a program to print the element of an array that has occurred the highest number of times
Eg) Array -> 10,20,10,30,40,100,99
O/P:10
*/

import java.util.*;
import java.util.Map.Entry;

class Prog8 {
    int mostFreq(int arr[]) {
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i:arr) {
            if (hash.containsKey(i)) {
                int freq = hash.get(i);
                freq++;
                hash.put(i,freq);
            }
            else hash.put(i,1);
        }

        int max = 0, res = -1;
        for (Entry<Integer, Integer> i:hash.entrySet()) {
            if (max < i.getValue()) {
                res = i.getKey();
                max = i.getValue();
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,10,30,40,100,99};
        System.out.println(new Prog8().mostFreq(arr));
    }
}