import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ort;

        System.out.print("Matematik Notunuzu Giriniz = ");
        int matematik = input.nextInt();
        System.out.print("Fizik Notunuzu Giriniz = ");
        int fizik = input.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz = ");
        int türkce = input.nextInt();
        System.out.print("Kimya Notunuzu Giriniz = ");
        int kimya = input.nextInt();
        System.out.print("Müzik Notunuzu Giriniz = ");
        int muzik = input.nextInt();

        if (matematik > 100 || matematik < 0){
            ort = (fizik + türkce + kimya + muzik)/4;
        }else if (kimya > 100 || kimya < 0){
            ort = (fizik + türkce + matematik + muzik)/4;
        }else if (fizik > 100 || fizik < 0){
            ort = (kimya + türkce + matematik + muzik)/4;
        }else if (türkce > 100 || türkce < 0){
            ort = (fizik + kimya + matematik + muzik)/4;
        }else if (muzik > 100 || muzik < 0){
            ort = (fizik + türkce + matematik + kimya)/4;
        }else{
            ort = (fizik + türkce + matematik + kimya + muzik)/5;
        }

        if (ort>=50){
            System.out.println("Notunuz = "+ort);
            System.out.println("Sınıfı Başarıyla Geçtiniz , Tebrikler...");
        }else{
            System.out.println("Notunuz = "+ort);
            System.out.println("Maalesef Sınıfı Geçemediniz...");
        }

    }
}
