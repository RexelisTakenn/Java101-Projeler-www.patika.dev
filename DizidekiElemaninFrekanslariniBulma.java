public class DizidekiElemaninFrekanslariniBulma {

    static boolean TekrarEdiyorMu(int arr[], int value){
        for (int i = 0 ; i<arr.length;i++){
            if(value==arr[i])
                return false;
        }
        return true;

    }


    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] dizi2 =new int[dizi.length];
        int counter = 0;
        int i , k ;
        int sayac;

        for (i=0; i<dizi.length; i++){
            sayac = 0;
            for (k=0 ; k<dizi.length; k++){
                if (dizi[i] == dizi[k]){
                    sayac++;
                }
            }
            if (TekrarEdiyorMu(dizi2, dizi[i])){
                dizi2[counter]=dizi[i];
                counter++;
                System.out.println(dizi[i] + " sayısı "+ sayac + " kadar tekrar edildi");
        }

    }


}}
