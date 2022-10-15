import java.util.Scanner;

public class KdvTutarıHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kdvOran = 0.18;

        System.out.print("Para Değeri Giriniz = ");
        double deger = input.nextDouble();

        double kdvTutar = deger*kdvOran;
        double kdvliFiyat = deger+kdvTutar;

        System.out.println("KDV'siz Fiyat = "+deger);
        System.out.println("KDV Oranı = "+kdvOran);
        System.out.println("KDV'li Fiyat = "+kdvliFiyat);
        System.out.println("KDV Tutarı = "+kdvTutar);


    }
}
