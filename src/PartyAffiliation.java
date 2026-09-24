import java.util.Scanner;
public class PartyAffiliation {
    static void main() {
        Scanner in = new Scanner(System.in);
        String politicalParty = "";

        IO.print("What is your political party affiliation? ([D]emocrat, [R]epublican, [I]ndependent): ");
        if (in.hasNextLine()) {
            politicalParty = in.nextLine();

            /*if (politicalParty.equalsIgnoreCase("D"))
                IO.print("You get a Democratic Donkey!");
            else if (politicalParty.equalsIgnoreCase("R"))
                IO.print("You get a Republican Elephant!");
            else if (politicalParty.equalsIgnoreCase("I"))
                IO.print("You get an independent man!");
            else
                IO.print("I don't know that party! You chose \"" + politicalParty + "\"!");

             */
            switch (politicalParty) {
                case "D", "d":
                    IO.print("You get a Democratic Donkey!");
                    break;
                case "R", "r":
                    IO.print("You get a Republican Elephant!");
                    break;
                case "I", "i":
                    IO.print("You get an independent man!");
                    break;
                default:
                    IO.print("I don't know that party! You chose \"" + politicalParty + "\"!");
                    break;
            }
        }
    }
}