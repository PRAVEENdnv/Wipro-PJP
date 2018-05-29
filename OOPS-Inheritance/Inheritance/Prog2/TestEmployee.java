/*
Create a class called Person with a member variable name. Save it in a file called Person.java
Create a class called Employee who will inherit the Person class.The other data members of the employee class are annual salary (double), the year the employee started to work, and the national insurance number which is a String.Save this in a file called Employee.java
Your class should have a reasonable number of constructors and accessor methods.
Write another class called TestEmployee, containing a main method to fully test your class definition.
*/

class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Rohit", 27000.00, 2018, "4156203");
        emp.getName();
        emp.getSalary();
        emp.getYearOfWork();
        emp.getInsureNo();
    }
}