import java.util.Scanner;

public class DaireninAlaniniVeCevresiniHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14;

        System.out.print("Yarıçap Giriniz = ");
        int r = input.nextInt();

        double alan = pi*r*r;
        double cevre = 2*pi*r;

        System.out.println("Alan = "+alan);
        System.out.println("Çevre = "+cevre);
    }
}
