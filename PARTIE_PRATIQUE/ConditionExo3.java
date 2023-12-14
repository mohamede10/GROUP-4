import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();

        System.out.print("Entrez le troisième nombre : ");
        double nombre3 = scanner.nextDouble();

        double plusGrand = trouverPlusGrand(nombre1, nombre2, nombre3);

        System.out.println("Le plus grand parmi les trois nombres est : " + plusGrand);

        scanner.close();
    }

    public static double trouverPlusGrand(double nombre1, double nombre2, double nombre3) {
        if (nombre1 >= nombre2 && nombre1 >= nombre3) {
            return nombre1;
        } else if (nombre2 >= nombre1 && nombre2 >= nombre3) {
            return nombre2;
        } else {
            return nombre3;
        }
    }
}

