/*
 Create  a base class Fruit which has name ,taste and size as its attributes. A method called eat() is created which describes the name of the fruit and its taste. Inherit the same in 2 other class Apple and Orange and override the eat() method to represent each fruit taste.
*/

class Fruit {
    String name, taste, size;

    public Fruit(String _name, String _taste, String _size) {
        name = _name;
        taste = _taste;
        size = _size;
    }

    public void eat() {
        System.out.println("Fruit: " + name);
        System.out.println("Taste: " + taste);
        System.out.println("Size: " + size);
    }
}

class Apple extends Fruit {
    public Apple() {
        super("Apple", "Sweet", "small");
    }
}

class Orange extends Fruit {
    public Orange() {
        super("Orange", "Sour", "medium");
    }
}

class Test {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        apple.eat();
        Fruit orange = new Orange();
        orange.eat();
    }
}