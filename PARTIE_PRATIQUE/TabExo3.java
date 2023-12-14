public class TabExo3 {

    public static void main(String[] args) {
        int[] tableau = {12, 5, 27, 8, 15, 3};

        trierTableau(tableau);

        System.out.println("Tableau trié par ordre croissant :");
        afficherTableau(tableau);
    }

    public static void trierTableau(int[] tableau) {
        if (tableau == null || tableau.length <= 1) {
            // Aucun tri nécessaire pour un tableau vide ou d'un seul élément
            return;
        }

        int n = tableau.length;

        for (int i = 0; i < n - 1; i++) {
            // Trouver l'indice du plus petit élément non trié
            int indiceMinimum = i;

            for (int j = i + 1; j < n; j++) {
                if (tableau[j] < tableau[indiceMinimum]) {
                    indiceMinimum = j;
                }
            }

            // Échanger l'élément minimum avec le premier élément non trié
            int temp = tableau[indiceMinimum];
            tableau[indiceMinimum] = tableau[i];
            tableau[i] = temp;
        }
    }

    public static void afficherTableau(int[] tableau) {
        for (int nombre : tableau) {
            System.out.print(nombre + " ");
        }
        System.out.println();
    }
}

