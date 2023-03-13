import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eleman = 0 , a = 0;

        System.out.print("Dizinin Boyutu n : ");
        int boyut = input.nextInt();

        int[] dizi = new int[boyut];

        System.out.println("Dizinin Elemanlarını Giriniz ");
        for (int i=0; i < boyut; i++){
            System.out.print(i + ". Elemanı : ");
            dizi[i] = input.nextInt();
        }
        Arrays.sort(dizi);

        System.out.println("Sıralama : " + Arrays.toString(dizi));



    }
}
