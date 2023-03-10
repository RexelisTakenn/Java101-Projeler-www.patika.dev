public class HarmonikOrtalamaHesaplama {
    public static void main(String[] args) {
        double[] dizi = {34, 55, 67, 44, 200, 55, 84};
        double toplam = 0.0;
        for(int i = 0; i < dizi.length; i++)
            toplam += 1.0 / dizi[i];
        double harmonikOrtalama = (double) dizi.length / toplam;
        System.out.println(harmonikOrtalama);
    }
}
