import java.util.Scanner;

public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("1. Kenarı Giriniz = ");
        int a = input.nextInt();
        System.out.print("2. Kenarı Giriniz = ");
        int b = input.nextInt();

        double c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs = " + c);



    }
}
