import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exemple de tableau d'entiers
        int[] tableau = {1, 2, 3, 4, 2, 5, 2, 6, 7, 8, 2};

        System.out.print("Entrez l'élément à rechercher dans le tableau : ");
        int elementRecherche = scanner.nextInt();

        int occurrences = compterOccurrences(tableau, elementRecherche);

        System.out.println("Le nombre d'occurrences de " + elementRecherche + " dans le tableau est : " + occurrences);

        scanner.close();
    }

    public static int compterOccurrences(int[] tableau, int elementRecherche) {
        int occurrences = 0;

        for (int nombre : tableau) {
            if (nombre == elementRecherche) {
                occurrences++;
            }
        }

        return occurrences;
    }
}

