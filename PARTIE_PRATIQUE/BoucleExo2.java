public class Main {

    public static void main(String[] args) {
        int limite = 100;
        int somme = calculerSomme(limite);

        System.out.println("La somme des nombres de 1 à " + limite + " est : " + somme);
    }

    public static int calculerSomme(int limite) {
        int somme = 0;
        int nombre = 1;

        while (nombre <= limite) {
            somme += nombre;
            nombre++;
        }

        return somme;
    }
}

