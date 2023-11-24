import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Taksimetre hesaplayan program:
        gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */

        // kullanicidan girdi almak icin Scanner sinifinindan  input nesnesi urettik
        Scanner input = new Scanner(System.in);

        // degiskenleri tanimladik
        int acilisUcreti=10,minTutar=20,km;// acilis ucreti tanimlamak yerine odenecek tutari 10 dan baslatabilirdik
        double kmFiyati=2.2,odenecekTutar,sum;

        // kullanicidan girdiyi aldik
        System.out.print("Kac km gideceksiniz: ");
        km = input.nextInt();
        sum = acilisUcreti+km*kmFiyati;

        // odenecek tutarin min tutar ile kontrolunu yaptik
        odenecekTutar = sum>20 ? sum:minTutar;

        // sonuc
        System.out.println("Odenecek tutar: "+odenecekTutar);
    }
}