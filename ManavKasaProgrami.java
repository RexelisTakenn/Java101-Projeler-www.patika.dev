import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç Kilo Armut Aldınız ? = ");
        int armut = input.nextInt();

        System.out.print("Kaç Kilo Elma Aldınız ? = ");
        int elma = input.nextInt();

        System.out.print("Kaç Kilo Domates Aldınız ? = ");
        int domates = input.nextInt();

        System.out.print("Kaç Kilo Muz Aldınız ? = ");
        int muz = input.nextInt();

        System.out.print("Kaç Kilo Patlıcan Aldınız ? = ");
        int patlican = input.nextInt();

        double armutTutar = armut * 2.14;
        double elmaTutar = elma * 3.67;
        double domatesTutar = domates * 1.11;
        double muzTutar = muz * 0.95;
        double patlicanTutar = patlican * 5;

        double toplam = armutTutar + elmaTutar + domatesTutar + muzTutar + patlicanTutar;

        System.out.println("Toplam Tutar = " + toplam);
    }
}
