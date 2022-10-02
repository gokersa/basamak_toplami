import java.util.Scanner;

public class basamak_toplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamaklarını toplamak isitediğiniz sayıyı giriniz: ");
        int number = input.nextInt();
        int basTotal=0;
        int basCount=0;
        while (number!=0) {
            basTotal += (number%10);
            number/=10;
            basCount++;
        }

        System.out.println("Girdiğiniz sayının basamakları toplamı: " + basTotal);



    }
}

