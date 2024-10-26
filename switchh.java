import java.util.Scanner;

public class switchh {
    public static void main(String[] args) {
        String daString;
        Scanner s = new Scanner(System.in);
        int day;
        System.out.print("Enter the day -");
        day = s.nextInt();
        switch (day) {
            case 1:
                daString = "Sunday";
                break;
            case 2:
                daString = "Monday";
                break;
            case 3:
                daString = "Tuesday";
                break;
            case 4:
                daString = "Wednesday";
                break;
            case 5:
                daString = "Thursday";
                break;
            case 6:
                daString = "Friday";
                break;
            case 7:
                daString = "Saturday";
                break;

            default:
                daString = "Please enter the valid choice";
                break;
        }
        System.out.println(daString);

    }

}
