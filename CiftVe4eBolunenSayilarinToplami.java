import java.util.Scanner;
public class CiftVe4eBolunenSayilarinToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi,toplam=0;
        boolean kosul = true;

        while (kosul){
            System.out.print("Sayı Giriniz:");
            sayi = input.nextInt();

            if(sayi%2 == 0){
                if(sayi%4 == 0){
                    toplam += sayi;
                }
            }
            else {
                System.out.println("Çift ve 4'e bölünen sayıların toplamı:" + toplam);
                kosul = false;
            }
        }

    }
}
