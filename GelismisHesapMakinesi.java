import java.sql.SQLOutput;
import java.util.Scanner;

public class GelismisHesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim = 0;

        while (true){

            System.out.println("Toplama(1) - Çıkarma(2) - Bölme(3) - Çarpma(4) - Üst Alma(5) - Faktoriyel(6) - Mod(7) - Dikdörtgen Alan ve Çevre Hesaplama İşlemi(8) - Programdan Çıkış(9)");
            System.out.print("Yapmak İstediğiniz İşlem Nedir : ");
            secim = input.nextInt();
            if (secim == 9){
                System.out.println("GÜLE GÜLE!");
                break;
            }
            if (secim >= 10 || secim < 1){
                System.out.println("Lütfen Geçerli Bir Seçim Giriniz!!");
                System.out.println("\n");
            }

            if (secim == 1){
                toplama();
            } else if (secim == 2) {
                cikarma();
            } else if (secim == 3) {
                bolme();
            } else if (secim == 4) {
                carpma();
            } else if (secim == 5) {
                ust();
            } else if (secim == 6) {
                faktoriyel();
            } else if (secim == 7) {
                mod();
            } else if (secim == 8) {
                dikdortgen();
            }

        }
    }

    public static void toplama() {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        int sayi2 = input.nextInt();

        System.out.println("TOPLAMA SONUÇ = " + (sayi1 + sayi2));
        System.out.println("\n");
    }

    public static void cikarma(){
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        int sayi2 = input.nextInt();

        System.out.println("ÇIKARMA SONUÇ = " + (sayi1-sayi2));
        System.out.println("\n");
    }

    public static void carpma(){
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        int sayi2 = input.nextInt();

        System.out.println("ÇARPMA SONUÇ = " + (sayi1*sayi2));
        System.out.println("\n");
    }

    public static void bolme(){
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        int sayi2 = input.nextInt();

        System.out.println("BÖLME SONUÇ = " + (sayi1/sayi2));
        System.out.println("\n");
    }

    public static void ust(){
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        int sayi2 = input.nextInt();

        System.out.println("ÜST ALMA SONUÇ = "+ Math.pow(sayi1,sayi2));
        System.out.println("\n");
    }

    public static void faktoriyel(){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int sayi1 = input.nextInt();

        int islem=1;
        for (int i=1;i<=sayi1;i++){
            islem = islem * i;
        }
        System.out.println("FAKTORİYEL SONUÇ = " + islem);
        System.out.println("\n");
    }

    public static void mod(){
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        int sayi2 = input.nextInt();

        System.out.println("MOD ALMA SONUÇ = " + (sayi1%sayi2));
        System.out.println("\n");
    }

    public static void dikdortgen(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kısa Kenar Giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("Uzun Kenar Giriniz : ");
        int sayi2 = input.nextInt();

        System.out.println("DİKDÖRTGENİN ALANI : " + sayi1*sayi2);
        System.out.println("DİKDÖRTGENİN ÇEVRESİ : " + 2*(sayi1+sayi2));
        System.out.println("\n");
    }
}
