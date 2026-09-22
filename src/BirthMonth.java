import java.util.Scanner;
public class BirthMonth {
    static void main() {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        IO.print("Enter birth month [1-12]: ");

        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();

            if (1 <= birthMonth && birthMonth <= 12) {
                IO.print("Your birth month is: " + birthMonth);
            } else {
                IO.print("You entered an incorrect month value: " + birthMonth);
            }
        } else {
            trash = in.nextLine();
            IO.print("You entered an incorrect month value: \"" + trash + "\"");
            System.exit(0);
        }
    }
}