import java.util.Scanner;

public class verjaaardagTeller {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        jarig verjaardag = new jarig();
        System.out.println("Welke maand is het in getallen?");
        verjaardag.maandHuidig = input.nextInt();

        System.out.println("Het is dus nu de "+ verjaardag.maandHuidig+"e maand.");
        System.out.println("In welke maand ben je jarig in getallen?");
        verjaardag.maandJarig = input.nextInt();

        System.out.println("Je bent dus jarig in de "+ verjaardag.maandJarig+"e maand.");
        verjaardag.antwoord();
    }
}
