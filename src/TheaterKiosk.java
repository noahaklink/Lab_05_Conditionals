import java.util.Scanner;
public class TheaterKiosk {
    static void main() {
        Scanner in = new Scanner(System.in);
        final int MINIMUM_AGE = 21;
        int age = 0;
        String trash = "";

        IO.print("What is your age? ");
        if (in.hasNextInt()) {
            age = in.nextInt();
        } else {
            trash = in.nextLine();
            IO.print("You entered an incorrect age: " + trash);
            System.exit(0);
        }

        if (age >= MINIMUM_AGE) {
            IO.print("Here is your wristband! Enjoy the movie");
        } else {
            IO.print("Sorry, you are too young to enjoy the movie");
        }
    }
}
