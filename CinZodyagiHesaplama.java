import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] dizi = {"Maymun","Horoz","Köpek","Domuz","Fare","Öküz","Kaplan","Tavşan","Ejderha","Yılan","At","Koyun"};

        System.out.print("Doğum Yılınızı Giriniz : ");
        int yil = input.nextInt();

        for (int i=0; i<12; i++){
            if (yil%12==i){
                System.out.println(dizi[i]);
            }
        }
    }
}
