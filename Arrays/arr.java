/*
 Array are used to store multiple value in single variable, instead of declaring
 separate variable for each value.

 */
package Arrays;

class arr { // this the class

    // first method
    static void array() { //

        int[] ar = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i < ar.length; i++) {
            System.out.print(" " + ar[i]);

        }

    }

    // second method
    static void array2() {
        int[] ar1;
        ar1 = new int[5];
        ar1[0] = 1;
        ar1[1] = 123;
        ar1[2] = 143;
        ar1[3] = 90;
        ar1[4] = 891;
        System.out.print("Elements are =");
        for (int i = 0; i < ar1.length; i++) {
            System.out.print(" " + ar1[i]);

        }

    }

    /*
     * Multidimensional Arrays:
     * Multidimensional arrays are arrays of arrays with each element of the array
     * holding the reference of other arrays. These are also known as Jagged Arrays.
     * A multidimensional array is created by appending one set of square brackets
     * ([]) per dimension.
     * 
     * Syntax :
     * 
     * datatype [][] arrayrefvariable;
     * or
     * datatype arrayrefvariable[][];
     */
    static void multidimensional() {
        String[][] str = {
                { "Chandu", "Sonal", "Paras" },
                { "Manish", "Saurabh", "M2-Plus" },

        };
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                System.out.print(" " + str[i][j]);
            }
            System.out.println();
        }
    }

    // find the even and odd number from an array
    static void Chandu() {
        int[] eve = { 12, 32, 44, 54, 67, 87, 65, 45, 23 };
        System.out.print("Even Number - ");
        int sum;
        int even;
        for (int i = 0; i < eve.length; i++) {
            if (eve[i] % 2 == 0) {
                even = eve[i];
                sum = +even;
                System.out.print(" " + even);
            }
            // } else {
            // System.out.println(" " + eve[i]);
            // }
        }
    }

    public static void main(String[] args) {
        // array();
        // array2();
        // multidimensional();
        Chandu();
    }
}