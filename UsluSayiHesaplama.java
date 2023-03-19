import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int taban, ust, toplam = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Taban bilgisini giriniz: ");
        taban = input.nextInt();

        System.out.print("Üst bilgisini giriniz: ");
        ust = input.nextInt();

        for (int i = 0; i < ust; i++) {
            toplam *= taban;
        }

        System.out.println("Yanıt: " + toplam);

    }
}
