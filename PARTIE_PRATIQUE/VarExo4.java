import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez l'option de conversion :");
        System.out.println("1. Celsius vers Fahrenheit");
        System.out.println("2. Fahrenheit vers Celsius");

        // Lecture du choix de l'utilisateur
        int choix = scanner.nextInt();

        if (choix == 1) {
            // Conversion de Celsius vers Fahrenheit
            System.out.print("Veuillez entrer la température en degrés Celsius : ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + " degrés Celsius équivalent à " + fahrenheit + " degrés Fahrenheit.");
        } else if (choix == 2) {
            // Conversion de Fahrenheit vers Celsius
            System.out.print("Veuillez entrer la température en degrés Fahrenheit : ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println(fahrenheit + " degrés Fahrenheit équivalent à " + celsius + " degrés Celsius.");
        } else {
            System.out.println("Option non valide. Veuillez choisir 1 ou 2.");
        }

        // Fermeture du scanner (bonne pratique)
        scanner.close();
    }
}
