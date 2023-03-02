import java.util.Scanner;

public class GirilenSayiyaKadarUcVeDortBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        int toplam=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int sayi = input.nextInt();

        for (int i=0;i<=sayi;i++){
            if (i%3==0 && i%4==0){
                toplam = toplam + i;
            }
        }
        System.out.println(toplam/sayi);
    }
}
