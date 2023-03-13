import java.lang.reflect.Array;
import java.util.Arrays;

public class DizidekiTekrarEdenCiftSayilariBulma {
    static boolean isFind(int[] arr , int value){
        for (int i:arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] dizi = {10,7,10,3,2,9,10,21,4,33,9,4};
        int[] duplicate = new int[dizi.length];
        int StartIndex = 0;

        for (int i=0; i < dizi.length; i++){
            for (int j=0; j < dizi.length; j++){
                if(i != j && dizi[i] == dizi[j]){
                    if (!isFind(duplicate,dizi[i])){
                        duplicate[StartIndex++] = dizi[i];
                    }
                }
            }
        }

        for (int value : duplicate){
            if (value != 0 && value%2==0){
                System.out.println(value);
            }
        }

    }
}
