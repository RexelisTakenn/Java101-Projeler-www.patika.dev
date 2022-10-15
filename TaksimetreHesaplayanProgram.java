import java.util.Scanner;

public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double acilisUcret = 10;

        System.out.print("Mesafeyi KM cinsinden yazınız = ");
        int km = input.nextInt();

        double tutar = (km*2.20);//Mesafe başına 2.20 TL ödenecektir.
        tutar += acilisUcret;

        if(tutar <= 20){
            System.out.println("Ücretiniz 20 TL");
        }
        else{
            System.out.println("Ücretiniz "+(float)tutar+" TL");
        }
    }
}
