import java.util.Scanner;

public class MükemmelSayiBulanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" Bir sayı giriniz: ");
        int sayi = input.nextInt(), toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (toplam == sayi) {
            System.out.print(sayi + " mükemmel sayıdır. ");
        }else {
            System.out.print(sayi + " mükemmel sayı değildir. ");
        }
    }
}
