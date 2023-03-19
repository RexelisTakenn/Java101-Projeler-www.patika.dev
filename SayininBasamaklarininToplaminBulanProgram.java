import java.util.Scanner;

public class SayininBasamaklarininToplaminBulanProgram {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sayıyı giriniz: ");
        sayi = input.nextInt();

        while (sayi != 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }

    }
}
