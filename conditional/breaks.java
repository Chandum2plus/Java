package conditional;

public class breaks {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
                System.out.println("condition breacked ! at " + i);
                break;
            }
            System.out.println(i);
        }
        for (int j = 1; j <= 10; j++) {
            if (j == 3) {
                System.out.println("Iteration continued at " + j + " It means without printing 3 iteration has jumped");

                continue;

            }
            System.out.println(j);
        }
    }
}