/*
Create a class called Person with a member variable name. Save it in a file called Person.java
Create a class called Employee who will inherit the Person class.The other data members of the employee class are annual salary (double), the year the employee started to work, and the national insurance number which is a String.Save this in a file called Employee.java
Your class should have a reasonable number of constructors and accessor methods.
Write another class called TestEmployee, containing a main method to fully test your class definition.
*/

class Employee extends Person {
    private double annSalary;
    private int yearofWork;
    private String natInsureNo;

    public Employee(String name, double salary, int year, String no) {
        super(name);
        annSalary = salary;
        yearofWork = year;
        natInsureNo = no;
    }

    public double getSalary() {
        System.out.println("Salary: " + annSalary);
        return annSalary;
    }

    public int getYearOfWork() {
        System.out.println("Year employee started to work in: " + yearofWork);
        return yearofWork;
    }

    public String getInsureNo() {
        System.out.println("National Insurance Number: " + natInsureNo);
        return natInsureNo;
    }
}