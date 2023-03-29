import java.util.Scanner;

public class PalindromikKelimeleriBulanProgram {

    static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;

        while(i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelime Giriniz : ");
        String girilen = input.nextLine();

        if (isPalindrome(girilen) == true){
            System.out.println("Girilen Sayı Palindrom");
        }else {
            System.out.println("Girilen Sayı Palindrom Değildir");
        }

    }
}
