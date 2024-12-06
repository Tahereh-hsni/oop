
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int antalRader = 0;
        int antalTecken = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv något (skriv 'stop' för att avsluta):");

        while (true) { 
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            antalRader++;
            antalTecken += input.length();
        }

        System.out.println("Antal rader: " + antalRader);
        System.out.println("Antal tecken: " + antalTecken);

        scanner.close();
    }
}





