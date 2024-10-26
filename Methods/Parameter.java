package Methods;

/*
 Information can be passed to metjods as paramter. paramters act as vaariables inside
 the method

 Paramters are specified after the method name, inside the parenthesis.
 you can add as many paramters as you want, just separate them
 with a comma.

 The following example has a mthod that takes a String Called fname
 as parameter. When the method is called ,we pass along a first name,
 which is used inside the method to print the full name.

 */
public class Parameter {

    // this is the method wich contain the parameter
    static void myfunc(String name) {
        System.out.println(name);
    }

    // You can have as many parameters as you like:
    static void multParameter(String name, double d, double e) {
        System.out.println("Name - " + name);
        System.out.println("Age - " + d);
        System.out.println("Salary - " + e);

        /*
         * Note -: that when you are working with multiple parameters, the method
         * call must have the same number of arguments as there are parameters and the
         * arguments mut be passed in the same order.
         */
    }

    // RETURN VALUES
    /*
     * The void keyword, used in the examples above, indicates theat the method
     * should
     * not return a value. If you want the mehtod to return
     * a value, you can use a primitive data
     * type (such as int,char etc.) instead of void and use the return keyword
     * inside the
     * method
     */

    static String about(String name, String address) {
        return name + address;

    }

    // You can store the result in a variable (recommended, as it easier to read and
    // maintain)
    static int methodVar(int x, int y) {
        return x + y;

    }

    public static void main(String[] args) {
        // Calling the functions

        // myfunc("Chandu kumar"); // Calling the function

        // multParameter("Chandu", 22.9, 30000.500);

        // System.out.println(about("chandu kumar\n", "Adma"));

        // Here, i am storing the method in a variable
        int z = methodVar(34, 43);

        // Here, i am calling the function with the help of instance variable
        // of methodVar(x:34,y:43), which two parameters
        System.out.println("sum = " + z);

    }

}
