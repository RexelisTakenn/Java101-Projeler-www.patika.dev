import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, index = 0;
        System.out.print("Dizini Boyutunu Giriniz : ");
        n = input.nextInt();
        int[] dizi = new int[n];


        System.out.println("Dizinin Elemanalını Giriniz : ");
        for (int i=1; i <= n; i++){
            System.out.print(i + ". Eleman : ");
            int eleman = input.nextInt();
            dizi[index++] = eleman;
        }

        Arrays.sort(dizi);

        System.out.print("Sıralama : ");
        for (int j=0 ; j < n; j++){
            int a = dizi[j];
            System.out.print( a + " ");
        }

    }
}
