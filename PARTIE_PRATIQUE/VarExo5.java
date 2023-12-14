
import java.util.Scanner;
class VarExo5 {
    static float nb1, nb2, nb3, s,m;

    public static void main(String[] args) {
        System.out.println("donner trois notes");
        Scanner saisi = new Scanner(System.in);
        nb1 = saisi.nextFloat();
        nb2 = saisi.nextFloat();
        nb3 = saisi.nextFloat();
        s=(nb1+nb2+nb3);
        m=(s)/3;
        System.out.println("la moyenne des trois notes est:"+m);



    }
}