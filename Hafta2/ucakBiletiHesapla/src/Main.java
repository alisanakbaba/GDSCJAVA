import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        Mesafe başına ücret 0,10 TL / km olarak alın.
        İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */

        // Kullanacağımız değişkenleri tanımladık.
        Scanner input = new Scanner(System.in);
        int km,ucus_tipi,yas;
        double km_ucret=0.1,tutar;

        // Kullanıcı ile etkileşime geçtik.
        System.out.print("Mesafeyi km türünden giriniz: ");
        km=input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas=input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        ucus_tipi=input.nextInt();

        // İndirimler uygulanmadan toplam tutarı hesapladık.
        tutar=km*km_ucret;

        // Kullanıcının verileri doğru aralıkta girip girmemesini kontrol ediyoruz.
        if( (km>0) && (yas>0) && (ucus_tipi==1 || ucus_tipi==2)){
            if (yas<12){
                tutar*=0.5;                 // %50 indirim uyguladık
            } else if (yas>=12 && yas<=24) {
                tutar*=0.9;                 // %10 indirim uyguladık
            } else if (yas>=65) {
                tutar*=0.7;                 // %30 indirim uyguladık
            }

            if (ucus_tipi==2){               // Eğer gidiş dönüş ise
                tutar*=0.8;                  // %20 indirim uyguladık
                tutar*=2;                    // Gidiş dönüş olduğu için bilet parası iki ile çarpıldı
            }

            // Sonuç ekrana basıldı.
            System.out.println("Toplam tutar: "+tutar);

        }
        else{
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}