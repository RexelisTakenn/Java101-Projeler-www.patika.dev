import java.util.Scanner;

public class NotOrtalamasıHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik , fizik , kimya , türkçe ,tarih ,müzik ;

        System.out.print("Matematik Notunuzu Giriniz = ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz = ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz = ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz = ");
        türkçe = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz = ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz = ");
        müzik = input.nextInt();

        double ort = (matematik + fizik + kimya + türkçe + tarih + müzik)/6;

        System.out.println("Sınıf Ortalamanız = "+ort);

        String koşul = ort >= 50 ? "Geçti" : "Kaldı";

        System.out.println(koşul);
    }
}
