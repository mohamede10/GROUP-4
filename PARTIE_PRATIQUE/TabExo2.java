public class TabExo2 {

    public static void main(String[] args) {
        int[] tableau = {12, 5, 27, 8, 15, 3};

        int plusGrandeValeur = trouverPlusGrandeValeur(tableau);

        System.out.println("Le plus grand nombre dans le tableau est : " + plusGrandeValeur);
    }

    public static int trouverPlusGrandeValeur(int[] tableau) {
        if (tableau == null || tableau.length == 0) {
            // Gestion d'une entrée invalide (tableau vide ou nul)
            System.out.println("Le tableau est vide ou nul.");
            return Integer.MIN_VALUE;
            // Retourne la valeur minimale possible pour int
        }

        int max = tableau[0];

        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }

        return max;
    }
}

