import java.util.Scanner;

public class SayilariKucuktenBuyugeSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1,sayi2,sayi3;

        System.out.println("Birinci Sayıyı Giriniz : ");
        sayi1 = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz : ");
        sayi2 = input.nextInt();
        System.out.println("Üçüncü Sayıyı Giriniz : ");
        sayi3 = input.nextInt();

        if (sayi1 < sayi2 && sayi1 < sayi3){
            if (sayi2 < sayi3){
                System.out.println(sayi1 +  "< " + sayi2 + " < " + sayi3);
            }else {
                System.out.println(sayi1 + " < " + sayi3 + " < " + sayi2);
            }
        } else if (sayi2 < sayi1 && sayi2 < sayi3) {
            if (sayi1 < sayi3){
                System.out.println(sayi2 + " < " + sayi1 + " < " + sayi3);
            } else {
                System.out.println(sayi2 + " < " + sayi3 + " < " + sayi1);
            }
        } else if (sayi3 < sayi1 && sayi3 < sayi2) {
            if (sayi1 < sayi2){
                System.out.println(sayi3 + " < " + sayi1 + " < " + sayi2);
            } else {
                System.out.println(sayi3 + " < " + sayi2 + " < " + sayi1);
            }
        }
    }
}
