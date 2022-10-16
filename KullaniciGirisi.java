import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kayitKullanici = "kullanici" , kayitSifre = "123456";

        System.out.print("Kullanıcı Adı Giriniz = ");
        String kullaniciAdi = input.nextLine();
        System.out.print("Şifre Giriniz = ");
        String sifre = input.nextLine();

        if (kullaniciAdi.equals(kayitKullanici) && sifre.equals(kayitSifre)){
            System.out.println("Başarıyla Giriş Yapıldı...");
        }
        else{
            System.out.println("Kullanıcı Adı veya Şifre Yanlış..");
            System.out.print("Şifrenizi Sıfırlamak İstermisiniz? (E)/(H) ");
            String sifirlamaSorgu = input.nextLine();
            if (sifirlamaSorgu.equals("E") || sifirlamaSorgu.equals("e")){
                System.out.print("Yeni Şifrenizi Giriniz = ");
                String yeniSifre = input.nextLine();
                if (yeniSifre.equals(kayitSifre)){
                    System.out.println("Şifreniz Diğer Şifrenizle Aynı Olduğu İçin Değiştirilemedi...");
                }
                else{
                    System.out.println("Şifreniz Başarıyla Değiştirildi...");
                    kayitSifre = yeniSifre;
                    System.out.println(kayitSifre);
                }
            } else if (sifirlamaSorgu.equals("H") || sifirlamaSorgu.equals("h")){
                System.out.println("Lütfen Tekrar Giriş Yapmayı Deneyiniz...");
            }
        }
    }
}
