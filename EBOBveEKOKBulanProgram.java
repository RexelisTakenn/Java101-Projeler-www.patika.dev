import java.util.Scanner;

public class EBOBveEKOKBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1, sayi2, ebob = 1, ekok, i = 1;

        System.out.println("Lütfen Hesaplamak İstediğiniz İlk Sayıyı Giriniz : ");
        sayi1 = input.nextInt();

        System.out.println("Lütfen Hesaplamak İstediğiniz İkinci Sayıyı Giriniz : ");
        sayi2 = input.nextInt();

        while (i <= sayi1) {
            i++;
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println("Sayıların EBOB'u :  " + ebob);

        ekok = (sayi1 * sayi2) / ebob;
        System.out.println("Syılarının EKOK'u : " + ekok);
    }
}
