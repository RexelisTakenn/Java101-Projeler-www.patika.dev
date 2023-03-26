import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
            int limit;
            Scanner input = new Scanner(System.in);

            System.out.print("Fibonacci Serinizin Eleman Sayısı Kaç Olsun ? :");
            limit= input.nextInt();

            int a = 0, b=1;

            System.out.print(limit + " Elemanlı Fibonacci Serisi : ");
            System.out.print("0 "+ "1 ");
            int i =1, c;
            while(i<=limit-1){
                c=a+b;
                a=b;
                b=c;
                System.out.print(c +" ");
                i++;


            }

        }
}
