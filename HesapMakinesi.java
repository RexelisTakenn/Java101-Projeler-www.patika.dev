import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1 , sayi2 , topla , carp , bol , cikar , secim;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz = ");
        sayi1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz = ");
        sayi2 = input.nextInt();

        System.out.println("Seçiminiz Nedir? = Topla (1) Çıkar (2) Çarp (3) Böl (4)");
        secim = input.nextInt();

        switch (secim){
            case 1:
                System.out.println("Sonuç = " + (sayi1+sayi2));
                break;
            case 2:
                System.out.println("Sonuç = " + (sayi1-sayi2));
                break;
            case 3:
                System.out.println("Sonuç = " + (sayi1*sayi2));
                break;
            case 4:
                System.out.println("Sonuç = " + (sayi1/sayi2));
                break;
            default:
                System.out.println("Geçersiz İşlem Girdiniz...");

        }

    }
}
