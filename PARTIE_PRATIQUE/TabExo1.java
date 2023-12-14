import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] tableau1 = {1, 2, 3, 4, 5};
        int[] tableau2 = {6, 7, 8, 9, 10};

        int[] resultat = additionnerTableaux(tableau1, tableau2);

        // Afficher les tableaux et le résultat
        System.out.println("Tableau 1 : " + Arrays.toString(tableau1));
        System.out.println("Tableau 2 : " + Arrays.toString(tableau2));
        System.out.println("Résultat   : " + Arrays.toString(resultat));
    }

    public static int[] additionnerTableaux(int[] tableau1, int[] tableau2) {
        int longueurMax = Math.max(tableau1.length, tableau2.length);
        int[] resultat = new int[longueurMax];

        for (int i = 0; i < longueurMax; i++) {
            int valeurTableau1 = (i < tableau1.length) ? tableau1[i] : 0;
            int valeurTableau2 = (i < tableau2.length) ? tableau2[i] : 0;

            resultat[i] = valeurTableau1 + valeurTableau2;
        }

        return resultat;
    }
}


