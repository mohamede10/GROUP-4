import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Générer un nombre aléatoire entre 1 et 100
        int nombreAdeviner = random.nextInt(100) + 1;

        int tentative = 0;
        int guess;

        System.out.println("Devinez le nombre entre 1 et 100.");

        do {
            System.out.print("Entrez votre proposition : ");
            guess = scanner.nextInt();
            tentative++;

            if (guess < nombreAdeviner) {
                System.out.println("Le nombre à deviner est plus grand.");
            } else if (guess > nombreAdeviner) {
                System.out.println("Le nombre à deviner est plus petit.");
            } else {
                System.out.println("Félicitations ! Vous avez deviné le nombre en " + tentative + " tentatives.");
            }

        } while (guess != nombreAdeviner);

        scanner.close();
    }
}

