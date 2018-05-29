/*
 Create a class Box that uses a parameterized method to initialize the dimensions of a box.(dimensions are width, height, depth of double type). The class should have a method that can return volume. Obtain an object and print the corresponding volume in main() function.
*/

class Box {
    private double length, width, height;
    public Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    public double volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Box obj = new Box(10.1,2.5,5.3);
        System.out.println(obj.volume());
    }
}