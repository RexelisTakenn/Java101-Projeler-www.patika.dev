import java.util.Scanner;

public class VucutKitleIndeksiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu Giriniz = ");
        double kilo = input.nextDouble();
        System.out.print("Boyunuzu Metre Cinsinden Giriniz = ");
        double boy = input.nextDouble();

        double indeks = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz = "+indeks);
    }
}
