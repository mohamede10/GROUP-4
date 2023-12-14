public class TabExo4 {

    public static void main(String[] args) {
        int[] tableau1 = {1, 3, 5, 7, 9};
        int[] tableau2 = {2, 4, 6, 8, 10};

        int[] tableauFusionne = fusionnerTableauxTries(tableau1, tableau2);

        System.out.println("Tableau fusionné trié :");
        afficherTableau(tableauFusionne);
    }

    public static int[] fusionnerTableauxTries(int[] tableau1, int[] tableau2) {
        int longueur1 = tableau1.length;
        int longueur2 = tableau2.length;
        int[] tableauFusionne = new int[longueur1 + longueur2];

        int i = 0, j = 0, k = 0;

        // Fusionner les deux tableaux triés
        while (i < longueur1 && j < longueur2) {
            if (tableau1[i] < tableau2[j]) {
                tableauFusionne[k++] = tableau1[i++];
            } else {
                tableauFusionne[k++] = tableau2[j++];
            }
        }

        // Ajouter les éléments restants de tableau1
        while (i < longueur1) {
            tableauFusionne[k++] = tableau1[i++];
        }

        // Ajouter les éléments restants de tableau2
        while (j < longueur2) {
            tableauFusionne[k++] = tableau2[j++];
        }

        return tableauFusionne;
    }

    public static void afficherTableau(int[] tableau) {
        for (int nombre : tableau) {
            System.out.print(nombre + " ");
        }
        System.out.println();
    }
}