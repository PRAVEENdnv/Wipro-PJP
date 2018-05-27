/*
 Initialize an integer array with ascii values and print the corresponding character values in a single row.
*/

class Prog4 {
    public static void main(String[] args) {
        int chars[] = {72,101,108,108,111,32,87,111,114,108,100};
        for (int i = 0;i < chars.length;i++) {
            System.out.print((char) chars[i]);
        }
        System.out.println();
    }
}