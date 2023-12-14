import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre pour afficher sa table de multiplication : ");
        int nombre = scanner.nextInt();

        afficherTableMultiplication(nombre);

        scanner.close();
    }

    public static void afficherTableMultiplication(int nombre) {
        System.out.println("Table de multiplication de " + nombre + " :");

        for (int i = 1; i <= 10; i++) {
            int produit = nombre * i;
            System.out.println(nombre + " x " + i + " = " + produit);
        }
    }
}

