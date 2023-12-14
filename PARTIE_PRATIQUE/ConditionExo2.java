import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        determinerMajorite(age);

        scanner.close();
    }

    public static void determinerMajorite(int age) {
        if (age < 0) {
            System.out.println("Âge invalide. Veuillez entrer un âge positif.");
        } else if (age < 18) {
            System.out.println("Vous êtes mineur.");
        } else {
            System.out.println("Vous êtes majeur.");
        }
    }
}

