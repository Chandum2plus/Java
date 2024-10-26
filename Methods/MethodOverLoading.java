// =============POLYMORPHISM =============
//  ====== METHOD OVERLOADING =========== 
/*
  In java, method overloading allows different methods to have the smae name,
  but different signatures where the signature can differ by thee nubmer
  of input parameters or type of input parameters, or a mixture of both

 Method overloading in java is also known as Compile time polymorphism, Static
 Polymorphism, or Early binding. in method overlaoding campared to the parent argument,
 the child argument will get the highest priority.
 */

package Methods;

public class MethodOverLoading {

    // first method
    void add() {
        int a = 89, b = 78, c;
        c = a + b;
        System.out.println("Sum 1 = " + c);
    }

    // second method
    void add(int x, int y) {
        int c;
        c = x + y;
        System.out.println("sum 2 =" + c);
    }

    // third method
    void add(int x, double y) {
        double c;
        c = x + y;
        System.out.println("sum 3 =" + c);
    }

    // main function
    public static void main(String[] args) {

        MethodOverLoading m=new MethodOverLoading(); // object of the class named as 'm'

    // Here, calling the functions with the help of object of  MethodOverLoading 'm' using the dot(.) operator
        m.add();
        m.add(23, 89);
        m.add(23, 89.90);
        

    }
}
