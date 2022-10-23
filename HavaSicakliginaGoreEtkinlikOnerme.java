import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sıcaklık Giriniz : ");
        int sicaklik = input.nextInt();

        if (sicaklik < 5){
            System.out.print("Kayak Yapabilirsiniz");
        } else if (sicaklik >= 5 && sicaklik < 15 ) {
            System.out.print("Sinemaya Gidebilirsiniz");
        } else if (sicaklik >=15 && sicaklik < 25) {
            System.out.print("Pikniğe Gidebilirsiniz");
        } else if (sicaklik >= 25) {
            System.out.print("Yüzmeye Gidebilirsiniz");
        }
    }
}
