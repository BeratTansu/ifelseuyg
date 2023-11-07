import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
        System.out.print("Yaşınızı giriniz= ");
        int yas = scn.nextInt();

        if (yas >= 18){
            System.out.println("mekana girebilirsiniz!");
        }
        else {
            System.out.println("mekana giremezsiniz!!!!");
        }
        ----------------------------------------------------
        */

        System.out.println("lütfen bir sayo giriniz= ");
        int sayi = scn.nextInt();
        if (sayi<0){
            System.out.println("negatif");
        }
        else if (sayi==0){
            System.out.println("sıfır");
        }
        else {
            System.out.println("pozitif");
        }
    }
}
