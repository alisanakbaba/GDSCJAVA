import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*  KDV Tutarı Hesaplayan Program
            KDV siz tutarı ve KDV oranını kullanıcının girdiği program da kdv li fiyatını hesaplayınız.
            Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/

        // değişkenler tanımlandı
        Scanner input = new Scanner(System.in);
        int kdvsiz_fiyati;
        double kdvli_fiyati,kdv_orani;  // bölüm sonucu elde edileceği için ondalıklı sayı çıkabilir , oran ise bölünen olarak kullanılacağı için bu şekilde tanımlamalar yapıldı.

        // Kullanıcı ile etkileşime geçildi
        System.out.print("KDV siz fiyatı giriniz: ");
        kdvsiz_fiyati=input.nextInt();

        // Gerekli hesaplamalar yapıldı ve sonuç ekrana bastırıldı
        kdv_orani = kdvsiz_fiyati>1000 ? 8:18;   // Sonuca göre değer ataması yapıldı
        kdvli_fiyati = kdvsiz_fiyati + (kdvsiz_fiyati * (kdv_orani/100) );
        System.out.println("KDV li fiyatı: "+kdvli_fiyati);
    }
}