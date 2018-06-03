/*
Create a package called test package;
Define a class called foundation inside the test package; 
Inside the class, you need to define 4 integer variables; 
Var1 as private; 
Var2 as default; 
Var3 as protected; 
Var4 as public; 
Import this class and packages in another class. 
Try to access all 4 variables of the foundation class and see what variables are accessible and what are not accessible.
*/

import test.Foundation;

class Test {
    public static void main(String[] args) {
        Foundation f = new Foundation();
        //System.out.println(f.var1); --error: var1 has private access in Foundation
        //System.out.println(f.var2); --error: var2 is not public in Foundation; cannot be accessed from outside package
        //System.out.println(f.var3); -- error: var3 has protected access in Foundation
        System.out.println(f.var4);
    }
}