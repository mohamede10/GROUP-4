import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le poids du colis en kg : ");
        double poids = scanner.nextDouble();

        double fraisExpedition = calculerFraisExpedition(poids);

        System.out.println("Les frais d'expédition sont : $" + fraisExpedition);

        scanner.close();
    }

    public static double calculerFraisExpedition(double poids) {
        // Définir les tranches de poids et les tarifs correspondants
        double[] tranchesPoids = {1, 5, 10, 20};
        double[] tarifs = {5.0, 10.0, 15.0, 20.0, 25.0};

        // Vérifier dans quelle tranche de poids se trouve le colis
        for (int i = 0; i < tranchesPoids.length; i++) {
            if (poids <= tranchesPoids[i]) {
                return tarifs[i];
            }
        }

        // Si le poids est supérieur à la dernière tranche, appliquer un tarif supplémentaire
        return tarifs[tarifs.length - 1] + (poids - tranchesPoids[tranchesPoids.length - 1]) * 2.0;
    }
}

