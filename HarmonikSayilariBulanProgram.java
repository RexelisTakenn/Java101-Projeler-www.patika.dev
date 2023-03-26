import java.util.Scanner;

public class HarmonikSayilariBulanProgram {
    public static void main(String[] args) {
        int sayi;
        double sonuç = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        sayi = input.nextInt();

        int i =1;
        while(i <=sayi){
            sonuç += (1.0/i);
            i++;
        }

        System.out.println("Sonuç : " + sonuç);

    }
}
