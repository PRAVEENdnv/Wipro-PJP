/*
 A library needs to develop an online application for two types of users/roles, Adults and children. Both of these users should be able to register an account. 

Any user who is less than 12 years of age will be registered as a child and they can borrow a Kids category book for 10 days, whereas an adult can borrow Fiction category books which need to be returned within 7 days. 

Note: In future, more users/roles might be added to the library where similar rules will be enforced. 

Develop Interfaces and classes for the categories mentioned above.  
1. Create an interface LibraryUser with the following methods declared,
Method Name
registerAccount
requestBook

2. Create 2 classes KidUsers and AdultUser which implements the LibraryUser interface.

3.  Both the classes should have two instance variables as specified below.
Instance variables  Data type
age int
bookType String

4. The methods in the KidUser class should perform the following logic. 
registerAccount function:
if age < 12, a message displaying You have successfully registered under a Kids Account should be displayed in the console. 
If(age>12), a message displaying, Sorry, Age must be less than 12 to register as a kid should be displayed in the console. 
requestBook function: 
if bookType is Kids, a message displaying Book Issued successfully, please return the book within 10 days should be displayed in the console. 
Else, a message displaying, Oops, you are allowed to take only kids books should be displayed in the console. 
5. The methods in the AdultUser class should perform the following logic. 

registerAccount  function:
if age > 12, a message displaying You have successfully registered under an Adult Account should be displayed in the console.
If age<12, a message displaying, Sorry, Age must be greater than 12 to register as an adult should be displayed in the console.
requestBook function:
if bookType is Fiction, a message displaying Book Issued successfully, please return the book within 7 days should be displayed in the console.
Else, a message displaying, Oops, you are allowed to take only adult Fiction books should be displayed in the console.
6. Create a class LibraryInterfaceDemo.java with a main method which performs the below functions,
Test case #1:
Create an instance of KidUser class. 
Set the age as specified in the below table and invoke the registerAccount method  of the  KidUser object

Age
10
18

Set the book Type as specified in the below table and invoke the requestBook method of the KidUser object,

BookType
Kids
Fiction

Test case #2:

Create an instance of AdultUser class. 
Set the age as specified in the below table and invoke the registerAccount method of the AdultUser object

Age
5
23

Set the book Type as specified in the below table and invoke the requestBook method of the  AdultUser  object
BookType
Kids
Fiction
*/

import java.util.Scanner;

interface LibraryUser {
    public void registerAccount();
    public void requestBook();
}

class KidUser implements LibraryUser {
    private int age;
    private String bookType;

    public KidUser(int a, String b) {
        age = a;
        bookType = b;
    }

    public void registerAccount() {
        if (age <= 12) System.out.println("You have successfully registered under a Kids Account");
        else System.out.println("Sorry, Age must be less than 12 to register as a kid");
    }

    public void requestBook() {
        if (bookType.equals("Kids") && age < 12) System.out.println("Book Issued successfully, please return the book within 10 days");
        else System.out.println("Oops, you are allowed to take only kids books");
    }
}

class AdultUser implements LibraryUser {
    private int age;
    private String bookType;

    public AdultUser(int a, String b) {
        age = a;
        bookType = b;
    }

    public void registerAccount() {
        if (age > 12) System.out.println("You have successfully registered under a Adult Account");
        else System.out.println("Sorry, Age must be greater than 12 to register as a kid");
    }

    public void requestBook() {
        if (bookType.equals("Fiction") && age > 12) System.out.println("Book Issued successfully, please return the book within 7 days");
        else System.out.println("Oops, you are allowed to take only adult Fiction books");
    }
}

class LibraryInterfaceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account type(Kid/Adult), age and book type(Kids/Fiction): ");
        String actype = sc.next();
        int age = sc.nextInt();
        String bktype = sc.next();
        KidUser ku;
        AdultUser au;
        if (actype.equals("Kid")) {
            ku = new KidUser(age, bktype);
            au = null;
        }
        else {
            au = new AdultUser(age, bktype);
            ku = null;
        }

        if (ku != null) {
            ku.registerAccount();
            ku.requestBook();
        }

        if (au != null) {
            au.registerAccount();
            au.requestBook();
        }
    }
}