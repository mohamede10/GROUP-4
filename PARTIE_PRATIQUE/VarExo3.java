import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un nombre
        System.out.print("Veuillez saisir un nombre : ");

        // Lecture de la saisie utilisateur
        double nombre = scanner.nextDouble();

        // Calcul du carré du nombre
        double carre = nombre * nombre;

        // Affichage du résultat
        System.out.println("Le carré de " + nombre + " est : " + carre);

        // Fermeture du scanner (bonne pratique)
        scanner.close();
    }
}
