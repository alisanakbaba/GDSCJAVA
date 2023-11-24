import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("----Manav Kasa Programina Hosgeldiniz----");

        // girdi almak icin input nesnemizi kullancagiz
        Scanner input = new Scanner(System.in);

        // degiskenleri tanimladik,meyve kg fiyatlarini tanimladik
        double armut = 2.14 ,elma = 3.67 ,domates = 1.11, muz= 0.95, patlican = 5.00,total;
        int pearKg,appleKg,tomatoKg,bananasKg,aubergineKg;

        // kullanici alisverisini yapmaya basladi , girdileri doldurarak
        System.out.print("Armut Kac Kilo: ");
        pearKg=input.nextInt();
        System.out.print("Elma Kac Kilo: ");
        appleKg=input.nextInt();
        System.out.print("Domates Kac Kilo: ");
        tomatoKg=input.nextInt();
        System.out.print("Muz Kac Kilo: ");
        bananasKg=input.nextInt();
        System.out.print("Patlican Kac Kilo: ");
        aubergineKg=input.nextInt();

        // tutar hesaplandi
        total=(armut*pearKg)+(elma*appleKg)+(domates*tomatoKg)+(muz*bananasKg)+(patlican*aubergineKg);

        // sonuc bolumu
        System.out.println("Toplam Tutar: "+total);
    }
}