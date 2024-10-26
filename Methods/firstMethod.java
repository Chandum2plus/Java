package Methods;

import java.util.Scanner;

//class
public class firstMethod {

    int sum = 0; // declaring the variable for store the value after the adding.

    // this is the method with the parameters and return type
    public int sumOfTwo(int a, int b) {

        // adding the value
        sum = a + b;

        // returning the sum after adding
        return sum;

    }
}

/**
 * 
 */
class GF {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        // create the object of the first class inside the main() function
        firstMethod add = new firstMethod();
        int a, b;

        System.out.print("Enter the first number - ");
        a = p.nextInt();

        System.out.print("Enter the second number - ");
        b = p.nextInt();
        int s = add.sumOfTwo(a, b);
        System.out.println("sum of two number - " + s);

    }

}
