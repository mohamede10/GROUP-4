public class Main {

        public static void main(String[] args) {
            int a = 5;
            int b = 10;

            System.out.println("Avant l'échange :");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            // Échange sans variable temporaire à l'aide de XOR
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;

            System.out.println("\nAprès l'échange :");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }


}
