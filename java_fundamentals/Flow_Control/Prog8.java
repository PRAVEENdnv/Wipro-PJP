/*
 Write a program to print the color name, based on color code. If color code in not valid then print "Invalid Code". R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
*/

class Prog8 {
    public static void main(String[] args) {
        char a = args[0].charAt(0);
        String color = "";
        switch(a) {
            case 'R': color = "Red";
                      break;
            case 'B': color = "Blue";
                      break;
            case 'G': color = "Green";
                      break;
            case 'O': color = "Orange";
                      break;
            case 'Y': color = "Yellow";
                      break;
            case 'W': color = "White";
                      break;
            default: System.out.println("Invalid Code");
            return;
        }
        System.out.println(a+"->"+color);
    }
}