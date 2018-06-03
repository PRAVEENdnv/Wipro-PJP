/*
 Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive. For example if the inputs are “Wipro” and 3, then the output should be “propropro”.
*/

class Prog12 {
    public static void main(String[] args) {
        String s = "";
        int count = 0;
        try {
            s = args[0];
            count = Integer.parseInt(args[1]);
        }
        catch (Exception e) {
            System.out.println("Enter a string and integer");
        }
        String temp = "", str = s.substring(s.length() - count);
        while (count-- != 0) temp += str;
        System.out.println(temp);
    }
}