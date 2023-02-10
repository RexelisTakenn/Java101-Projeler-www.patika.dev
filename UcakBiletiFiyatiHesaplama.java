import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fiyat,cocukindirim,normalindirim,yasliindirim,gidisdonusfiyat = 0,yasindirimlifiyat = 0,sonfiyat;

        System.out.print("Mesafe Giriniz(KM) : ");
        int mesafe = input.nextInt();

        System.out.print("Yaşınızı Giriniz : ");
        int yas = input.nextInt();

        System.out.print("Yolculuk Tipi Seçiniz : \n Tek Yön İse 1 Tuşuna Basınız. \n Çift Yön İse 2 Tuşuna Basınız.");
        int yon = input.nextInt();

        if (mesafe < 1 && yas < 1){
            System.out.println("Hatalı Veri Girdiniz.");
        }else {
            fiyat = mesafe * 0.10;
            if (yas <= 12){
                cocukindirim = fiyat*0.50;
                yasindirimlifiyat = fiyat - cocukindirim;
            } else if (yas > 12 && yas <= 24) {
                normalindirim = fiyat*0.10;
                yasindirimlifiyat = fiyat - normalindirim;
            } else if (yas >=65) {
                yasliindirim = fiyat*0.30;
                yasindirimlifiyat = fiyat - yasliindirim;
            }
            else{
                yasindirimlifiyat = fiyat/2;
            }

            if (yon == 2){
                System.out.println("Seçtiğiniz yön gidiş-dönüş");
                gidisdonusfiyat = yasindirimlifiyat*0.20;
            }else {
                System.out.println("Seçtiğiniz yön tek yön");
            }

            sonfiyat = (yasindirimlifiyat - gidisdonusfiyat)*2;
            System.out.println("Fiyat : " + sonfiyat);
        }
    }
}
