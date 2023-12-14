
import java.util.Scanner;
class VarExo2 {
    static int L, l, s;

    public static void main(String[] args) {
        System.out.println("donner la longueur et la largeur");
        Scanner saisi = new Scanner(System.in);
        L = saisi.nextInt();
        l = saisi.nextInt();
        s = (L * l);
        System.out.println("la surface est:"+s);
    }
}