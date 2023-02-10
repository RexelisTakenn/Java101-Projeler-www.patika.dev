import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğdunuz ayı giriniz : ");
        int ay = input.nextInt();

        System.out.print("Doğdunuz günü giriniz : ");
        int gun = input.nextInt();

        if (ay <= 12 && gun <= 30) {

            if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
                System.out.println("Koç burcusunuz");
            }

            if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {
                System.out.println("Boğa burcusunuz");
            }

            if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) {
                System.out.println("İkizler burcusunuz");
            }

            if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) {
                System.out.println("Yengeç burcusunuz");
            }

            if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
                System.out.println("Aslan burcusunuz");
            }
            if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)){
                System.out.println("Başak burcusunuz");
            }

            if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
                System.out.println("Terazi burcusunuz");
            }

            if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
                System.out.println("Akrep burcusunuz");
            }

            if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
                System.out.println("Yay burcusunuz");
            }

            if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 21)){
                System.out.println("Oğlak burcusunuz");
            }

            if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)){
                System.out.println("Kova burcusunuz");
            }

            if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) {
                System.out.println("Balık burcusunuz");
            }
        }else{
            System.out.println("Geçersiz ay ve gün girdiniz.");
        }
    }

}
