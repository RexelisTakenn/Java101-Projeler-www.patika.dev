import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        int yil = input.nextInt();
        if (yil%4==0) {
            if (yil % 100 != 0 || yil % 400 == 0) {
                System.out.println(yil + " Artık yıldır");
            } else {
                System.out.println("Artık yıl değildir");
            }
        }else{
            System.out.println("Artık yıl değildir");
        }
    }
}
