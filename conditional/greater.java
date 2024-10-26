package conditional;

import java.util.Scanner;

public class greater {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); // it create the new memory address

        float a, b, c; // Here, taking the variable of float type

        System.out.print("Enter the first number - "); // Here, we are taking the input from keyboard
        a = s.nextInt();

        System.out.print("Enter  the second number - ");
        b = s.nextInt();

        System.out.print("Enter the third number - ");
        c = s.nextInt();

        // Checking the condition

        if (a >= b) { // if a will be a>=b, then it will enter the inner condition otherwise jumped
                      // the else part

            if (a >= c) { // after checking the above condition it will check the inner part,
                          // if inner part will true ,then it will execute.otherwise it will execute the
                          // inner else part
                System.out.println("Number1 is Greatest number" + a);

            } else {

                System.out.println("Number3 is Greatest number - " + c);
            }
        } else { // after the checking above condition it will check the condition of else part

            if (b >= a) { // Here, it is check the b>=a, if it will true, then it will go inner condition
                          // and check the b>=c if it will true, then it it will execute the condition
                          // otherwise it will execute the else part

                if (b >= c) {

                    System.out.println("Number2 is Greatest number " + b);
                } else {

                    System.out.println("Number3 is Greatest number -" + c);
                }
            } else { // if no anyone condition will true, then finelly it will execute and program
                     // will terminated.

                System.out.println("Number3 is Greatest number -" + c);

            }

        }

    }
}
