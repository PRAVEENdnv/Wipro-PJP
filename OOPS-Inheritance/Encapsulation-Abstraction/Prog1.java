/*
Create a class called Author is designed as follows:

It contains:
• Three private instance variables: name (String), email (String), and gender (char of either ‘m’ or ‘f’).
• One constructor to initialize the name, email and gender with the given values.

And, a class called Book is designed as follows:
It contains:
• Four private instance variables: name (String), author (of the class Author you have just created), price (double), and qtyInStock (int). Assuming that each book is written by one author.
• One constructor which constructs an instance with the values given.
• Getters and setters: getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(), setQtyInStock(). Again there is no setter for name and author.
Write the class Book (which uses the Author class written earlier). 
Try:
1. Printing the book name, price and qtyInStock from a Book instance. (Hint: aBook.getName())
2. After obtaining the Author object, print the Author (name, email & gender) of the book.
*/

class Author {
    public String name, email, gender;

    public Author(String _name, String _email, String _gender) {
        name = _name;
        email = _email;
        gender = _gender;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String _name, double _price, int _qty, String authName, String email, String gender) {
        name = _name;
        price = _price;
        qtyInStock = _qty;
        author = new Author(authName, email, gender);
    }

    public String getName() {
        System.out.println("Book Name: " + name); return name;
    }

    public Author getAuthor() {
        System.out.println("Author name: " + author.name);
        System.out.println("Author email: " + author.email);
        System.out.println("Author gender: " + author.gender);
        return author;
    }

    public double getPrice() {
        System.out.println("Book price: " + price);
        return price;
    }

    public int getQtyInStock() {
        System.out.println("Quantity in Stock: " + qtyInStock);
        return qtyInStock;
    }

    public void setPrice(double _price) { price = _price; }

    public void setQtyInStock(int qty) { qtyInStock = qty; }

    public static void main(String[] args) {
        Book book1 = new Book("1984", 211.50, 10, "George Orwell", "orwellg@gmail.com", "m");
        book1.getName();
        book1.getPrice();
        book1.getAuthor();
    }
}