package Methods;

import java.util.Scanner;

// Class named as bike
public class bike {

    static void speedTest() {

        Scanner s = new Scanner(System.in);

        double speed; // Declaring the variable

        System.out.print("Enter the speed - "); // Taking the use input
        speed = s.nextDouble();

        // Checking the condition
        if (speed >= 30 && speed <= 60) { // speed between the 30 and 60 is good speed for riding

            System.out.println("Haa thik hai jao 60 ke speed tak ja skte ho ");

        } else if (speed > 60 && speed <= 70) { // speed between the greater than 60 and 70 it is not good for riding

            System.out.println("Jyada Speed hai babu thoda kam speed karo ");

        } else if (speed > 70 && speed <= 90) { // speed between the greater than 70 and 90 it is dangerous for us.

            System.out.println("Itna Speed me chaloge to bhitre jaldiye jaoge !");

        } else if (speed > 90 && speed <= 100) { // speed between the greater 90 and 100 it so dangerous (more
                                                 // possibolity of eccident).

            System.err.println("Bhosadi ke hum bol rhe hai ki speed kam karo smjh me nhi aa rha hai tumko");

        } else if (speed > 100) { // speed greater than 100 pakka bhitre jaoge

            System.out.println("chla ja bhosdi ke ! Hum bol rhe the ki aram se chalao Chal gya n bhitre ");

        } else if (speed <= 20) { //

            System.out.println("Bahut kam speed hai thoda or badhao !");
        }
    }

    public static void main(String[] args) {
        speedTest();
    }

}
