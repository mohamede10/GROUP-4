import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre pour calculer sa factorielle : ");
        int nombre = scanner.nextInt();

        long factorielle = calculerFactorielle(nombre);

        System.out.println("La factorielle de " + nombre + " est : " + factorielle);

        scanner.close();
    }

    public static long calculerFactorielle(int n) {
        if (n < 0) {
            // Gestion d'une entrée invalide (nombre négatif)
            System.out.println("Veuillez entrer un nombre non négatif.");
            return -1;
        }

        long resultat = 1;
        int i = 1;

        while (i <= n) {
            resultat *= i;
            i++;
        }

        return resultat;
    }
}

