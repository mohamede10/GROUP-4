import java.util.Scanner;
public class Main {
    static int nb;
    public static void main(String[] args) {
        System.out.println("donner un nombre");
        Scanner saisi=new Scanner(System.in);
        nb=saisi.nextInt();
        if(nb%2==0){
            System.out.println("nb es pair");
        }
        else
            System.out.println("nb est impair");
    }
}
