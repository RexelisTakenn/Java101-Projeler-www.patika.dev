import java.util.Scanner;

public class DeseneGoreMetotOlusturanProgram {

    static void figure(int a) {
        System.out.print(a + " ");
        if (a <= 0) {
            return;
        }
        figure(a - 5);
        System.out.print(a + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N sayısı : ");
        int n = input.nextInt();
        System.out.print("Çıktısı : ");

        figure(n);

    }
}