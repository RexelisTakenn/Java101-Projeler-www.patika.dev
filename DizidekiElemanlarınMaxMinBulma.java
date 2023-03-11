import java.util.Scanner;

public class DizidekiElemanlarınMaxMinBulma {
    public static void main(String[] args) {
        int sayi;
        System.out.println("Bi sayı giriniz : ");
        Scanner input = new Scanner(System.in);
        sayi = input.nextInt();
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int min = sayi;
        int max = sayi;
        int temp;
        int temp1;
        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        for (int i : list) {
            if (i < sayi) {
                temp = i;
                if (temp > min) {
                    min = i;
                }
            }
            if (i > sayi) {
                temp = i;
                if (temp < max) {
                    max = i;
                }
            }
        }
        System.out.println("Girilen Sayı : " + sayi);
        System.out.println(sayi + " Sayısına En Yakın Minimum Değer " + min);
        System.out.println(sayi + " Sayısına En Yakın Maximum Değer " + max);
    }
}