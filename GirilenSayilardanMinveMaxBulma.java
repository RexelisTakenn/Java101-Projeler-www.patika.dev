import java.util.Scanner;

public class GirilenSayilardanMinveMaxBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int toplam, sayi , max = 0 , min = 0;
        System.out.print("Kaç adet sayı gireceksiniz: ");
        toplam = input.nextInt();

        for (int i = 1; i<=toplam; i++){
            System.out.print(i + ".Sayıyı giriniz: ");
            sayi = input.nextInt();

            if ( i == 1 ){
                max = sayi;
                min = sayi;
            }
            if ( sayi > max ){
                max=sayi;
            }
            if ( sayi < min ){
                min = sayi;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
