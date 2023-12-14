import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une année : ");
        int annee = scanner.nextInt();

        if (estBissextile(annee)) {
            System.out.println(annee + " est une année bissextile.");
        } else {
            System.out.println(annee + " n'est pas une année bissextile.");
        }

        scanner.close();
    }

    public static boolean estBissextile(int annee) {
        // Une année est bissextile si elle est divisible par 4
        // Sauf si elle est divisible par 100, auquel cas elle doit également être divisible par 400
        return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
    }
}

