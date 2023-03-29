import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tahmin = 0 , hak = 5;
        int random = (int) (Math.random() * 100);


        while(tahmin != random) {
            if (hak == 0) {
                System.out.println("Hakkınız Bitti.. ");
                System.out.println("Rastgele Üretilen Sayı : " + random);
                break;
            } else {

                System.out.println("Hakkınız : " + hak);

                System.out.print("Sayı Tahmini Yapınız : ");
                tahmin = input.nextInt();

                hak--;

                if (tahmin <= 0 || tahmin > 100) {
                    System.out.println("Lütfen 1 ile 100 arasında bir sayı giriniz.");
                    continue;
                }

                if (tahmin == random) {
                    System.out.println("Tebrikler , Sayıyı Doğru Bildiniz.. ");
                } else {
                    System.out.println("Doğru Bilemediniz , Lütfen Tekrar Deneyin.. ");
                    System.out.println("Kalan Hakkınız : " + hak);
                    if (random > tahmin) {
                        System.out.println("İpucu : Sayı Tahmin Edilen Sayıdan Büyük");
                    } else {
                        System.out.println("İpucu : Sayı Tahmin Edilen Sayıdan Küçük");
                    }
                }
            }
        }
    }
}
