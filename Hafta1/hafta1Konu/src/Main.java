public class Main {
    public static void main(String[] args) {
        // Java öğrenmeye yardımcı site:  w3shools.com sitesine girip üstten javayı seçerseniz öğrenmeye başlayabilirsiniz. Sayfada ki
        // try it your self kısmına tıklayarak ta orada da java yazarak kendinizi deneyebilirsiniz.


        // EKRANA ÇIKTI VERME
        // Kısayolu sout yazıp enter yapmak.
        System.out.println("Hello world!");
        System.out.println("Hello\nWorld!");     //     \n ---->  Alt satıra in.
        System.out.println("Hello\tWorld!");     //     \t ---->  Araya 3 boşluk bırak.
        System.out.println("Hello \'World!\'");  //     \'    \'  ---> Arasında yazdığımız metini tek tırnak içine alır.
        System.out.println("Hello \"World!\"");  //     \"    \"  ---> Arasına yazdığımız metini çift tırnak içine alır.
        System.out.println("Hello \\World!\\");  //     \\    \\  ---> Arasına yazdığımız metini iki \ arasına alır.
        System.out.println("5+3="+(5+3));        //     Çift tırnak içerisindeki metini ekrana basar,ardından belirttiğimiz işlemin sonucu hesaplar sonucu metinin yanına yazar.
        System.out.println(15/5);                //     Bu şekilde de direkt olarak sonuç hesaplatabiliriz.
        System.out.println(100*1000);            //     + , - , * , / , %(Modunu alma) gibi işlemleri direkt bu şekilde hesaplayabiliriz.




        // YORUM SATIRI

        // Bu satır Yorum Satırıdır. Program bu satırı çalıştırmaz. Bu kısımı programı yazan kişi kod okunabilirliği için parçalara böler ve o parçanın ne işe yaradığı hakkında bilgi verebilir.

        /* Bu da birden fazla satırı
            yorum satırı almak için
                kullanacağımız kısımdır
         */

        //  KISAYOLU ---> ctrl + shift + /  İlgili satırları shifte basılı tutup seçtikten sonra bu kısayol tuşları ile yorum satırına alabilirsiniz.





        // DEĞİŞKENLER VE VERİ TİPLERİ

         /* Java'daki İlkel Veri Tipleri
            Tam Sayılar       ----> -10,0,500,1000,245
                byte , short , int(Integer) ,long
            Ondalıklı Sayılar ----> 3.4,120.9,-12.4,5.0
                float,double
            Karakterler       ----->
                char
            Mantıksal Değerler
                boolean

        - Değişkenler programlamada geçici bilgileri sakladığımız ve programcı tarafındanbelirlenen yapılardır.
        - Değişkenler sayesinde program içinde yaptığımız işlemleri hafıza da tutar ve gerektiği yerlerde kullanırız.
        - Değişkenlerin 4 özelliği bulunur ; Veri Tipi, İsim, Değer ve Adres. Adreste tanımlanan değişkenin bilgisayar hafızasında kayıt edildiği yerdir.
        - Her değişkenin program içinde kullanıldığı ve çağrıldığı benzersiz bir ismi vardır. Bu değişkenlere birde değer atarız , işletim sistemimizde bu değişkeni hafızada tutar ve bir adres belirler.
        - Türkçe karakterler: Türkçe Karakterler yorum satırları haricinde kullanılmamalı.
        - Harf Duyarlılığı: Kelimelerdeki küçük ve büyük harfler farklı algılanır buna dikkat edelim.
        - Java da isimlendirilen tüm ögeler A-Z, a-z , ($) ve(_) ile başlayabilir.
        - Anahtar kelimeler isimlendirmede kullanılamaz. (min,max,length,....)
        - Değişkenleri isimlendirme de iki farklı tür var: 1. userName (ilk kelimedeki baş harf küçük diğer kelimelerdeki baş harfler büyük olacak şekilde )
                                                           2. user_name (Boşluk kullanamadığımız için kelimeler arasına '_' koyabiliriz)
          eğer sabit değişkenlerimiz varsa yani pi,e gibi sayılar bunları adlandırırken genelde şu şekilde kullanırız Pİ_SAYİSİ
        - Bu son maddede ki kullanım zorunluluğu yoktur ama kodun okunabilirliği için ve java da alışılmış bir gelenektir.
          */


        //  <veri tipi> <değişken ismi> = veri (değer)
        int numberOne = 32;             // İstersek değişkeni tanımladıktan sonra ona bir değer atarız.
        int numberOne ;                 // İstersek te değişkeni tanımlarız , değer verme işlemini sonra yaparız.
        int numberOne,numberTwo=2;      // İstersek te veri tipi aynı olan değişkenleri aralarına ',' koyarak tanımlayabiliriz

        double PI_SAYISI;
        PI_SAYISI = 3.14;

        //Hatalı Kullanım
        int a = 5;
        int a = 4;       // Değişkeni tanımlarken onun veri tipini belirttiğimiz için değişkene farklı bir değer atayacağımızda veri tipini belirtmek zorunda değiliz.

        //Doğru Kullanım
        int a = 5;
        a = 4;

        // Hatalı Kullanım
        int b = 12;
        b = "Hello World";      // Değişkene tanımlandığı veri tipi haricinde farklı bir veri tipindeki değer atandığı zaman hata alır.
        b = 12.3;               // int tanımlanan bir değişkene float veya double atanamaz. Ama float veya double tanımlanan bir değişkene int değer verirsek kendisi otomatik dönüştürür.
        double c = b;
        System.out.println("c: "+c);




        // TAM SAYILAR
        byte value1 = 14;           // -128 ile 127 arasında değer alır. 8 bit uzunluğundadır.
        short value2 = 100;         // -32768 ile 32767 arasında değer alır. 16 bit uzunluğundadır.
        int value3 = 1000;          // 32 bit uzunluğundadır. (Genelde int kullanırız.)
        long value4 = 10000;        // 64 bit uzunluğundadır. (int ın yetersiz kaldığı yerlerde)
        System.out.println("Value1: \t"+value1+"\nvalue2: \t"+value2);
        int value_5 = 5+value3;     // Bu şekilde  bir değişkenin değerini başka bir değişkenin değerini kullanarakta verebiliriz.


        // ONDALIKLI SAYILAR
        float value5 = 3.4F;        // 32 bit uzunluğundadır. Float tanımlamalardan sonra ‘f’ veya ‘F’ konulmalıdır.
        double value6 = 5;          // 64 bit uzunluğundadır. Daha yavaş, daha fazla yer kaplar matematiksel işlemlerde kullanılır cos,sin double döndürür.
        System.out.println(value6);


        // KARAKTERLER
        // ASCII kodları
        char vChara = 'k';               // Java'da karakter değişkenleri saklamak için Char kullanılır.
        char vCharb = 'K';               // Char veri tipleri birleşerek String Sınıfından bir yapıya dönüşür.
        char vCharc =  107;              // Java da karakterler 16 bittir.
        System.out.println("a: "+vChara+" b: "+vCharb+" c: "+vCharc);
        char vChar1 = 'J';
        char vChar2 = 'A';
        char vChar3 = 'V';
        char vChar4 = 'A';
        System.out.println(""+vChar1+vChar2+vChar3+vChar4);    // Başına "" koymamızın sebebi asci kodlarını toplamasın ve bu ifadenin String olduğunu anlasın diye.

        /*
        Peki karakterleri neden asci kodu ile de tanımlarız ?
        Örneğin, bir metin dosyasında yer alan karakterlerin ASCII kodları kullanılarak işlenmesi gerektiğinde, ASCII kodu ile tanımlama yapmak daha kolay ve hızlı olabilir.
        Ayrıca, bazı durumlarda, karakterlerin doğrudan tanımlanması yerine, ASCII kodu ile tanımlanması daha anlaşılır olabilir.
        Örneğin, bir karakterin ASCII kodu, karakterin Unicode koduna göre daha az sayıda bit kullanır ve bu nedenle daha az bellek kullanır. Bu, özellikle büyük veri kümeleri üzerinde çalışırken önemlidir
         */

        //BOOLEAN
        boolean logic1 = true;          //Boolean sadece iki değer alabilir : True ve False.
        boolean logic2 = false;         //Genellikle koşul ve döngü işlemlerinde, kontrol amaçlı olarak kullanılır.
        //AND ,OR, NOT

        //STRİNG
        String str1 = "Hello World!";                    // Metinsel türleri ifade eden bir data tipidir.
        boolean control1 = str1.equals("Hello world");   // Sayılar da kullandığımız == ifadesinin Stringler de ki karşılığıdır.
        System.out.println(str1.length());               // Metnin uzunluğunu ekrana bastırır. Metotları bu şekilde ekrana bastırır ya da bir değişken tanımlarız ve metottan dönen değeri bu değişkene eşitleriz.
        System.out.println(str1.charAt(2));              // Programlama da numaralandırma 0 dan başlar. charAt ta metindeki istenilen indeksteki değeri döndürür. char veri tipinde.
        System.out.println(control1);
        str1 = str1.toLowerCase();                       // Metindeki kelimelerin baş harflerini küçük yapar.
        System.out.println(str1);
        String str2 = "Merhaba Dünya!"+str1+"-------------";   // İstersekte string değerleri birleştirerek yeni bir String tipinde bir değişkene atayabiliriz.
        System.out.println(str2);

        // KULLANICIDAN VERİ ALMA
        // Değişkenlere değerleri manuel atamak yerine kullanıcıdan değer alarak ta atayabiliriz.

        Scanner input = new Scanner(System.in);         // Python da hazır olarak kullandığımız input u burada Scanner sınıfından üretmemiz gerekiyor.
        // Scanner sınıfını kullanabilmek için de bu sınıfı import etmeliyiz. Bunu da sayfanın en başına import java.util.Scanner yazarakta edebiliriz veya
        // sağ üst köşede aldığımız hataları gösteren bir kısım var yuvarlak içinde ünlem var tıkladığınız da orada hatalar detayları ile birlikte listelenir
        // Buradan Scanner adı geçen satıra tıklayıp sağ tık yapıp Show Quick-fixes ı seçip import class dersek te olur Hataları bu kısımdan çözmek daha kolaydır.
        System.out.print("Lütfen sayı giriniz: ");
        int number_one = input.nextInt();   // değişkenin veri tipine göre bu şekilde alıyoruz
        System.out.print("Lütfen string giriniz: ");
        input.nextLine();                   // Değişken string bir değer ise de bu şekilde
        String str_one = input.nextLine();
        System.out.println("Kullanıcıdan aldığımız int değeri: "+number_one+"\nKullanıcıdan aldığımız String değeri: "+str_one);

        // Scanner scan = new Scanner(System.in); kullanıcıdan veri almak için illa input yazmak zorunda değiliz nesnenin adını biz belirleriz
        // Eğer kullanıcıdan veri alırken bir tane değişkeni almadan programı bitirirse alacağınız değerden önce bir üst satıra input.nextLine() yazınız.
        // ör:  input.nextLine();
        //      int a = input.nextLine();    program a değişkenin değerini kullanıcıdan almadan bitirirse bu şekilde kullanmamız gerekiyor



        /* TEMEL OPERATÖRLER
        Java dilinde operatörler birçok işlemi yapabilmenize olanak tanır. Örneğin: matematiksel operatörlerle birlikte aritmetik işlemler yapabilmenizi,
        ilişkisel operatörlerle verileri kıyaslayabilmeyi, atama operatörleri ile değişkenlerin değerlerini değiştirmeye fırsat verir.*/


        // 1.ATAMA OPERATÖRÜ

        int sayi1 = 5;
        double sayi2;
        sayi2 = sayi1;          // sayi2 değişkenin yeni değeri sayi1 değişkenin değeri oldu.
        sayi2+= sayi1;          // sayi2 = sayi2+ sayi1     Bu şekilde fazlalık yerine satır başındaki kullanımı daha doğrudur.
        sayi2-= sayi1;          // sayi2 = sayi2- sayi1
        sayi2*= sayi1;          // sayi2 = sayi2* sayi1
        sayi2/= sayi1;          // sayi2 = sayi2/ sayi1
        System.out.println(sayi2);
        sayi2%=sayi1;           // Mod alma işlemi yani ilk sayıyı ikinci sayıya böldüğünüzde 'kalan' ı temsil ediyor  ör: 5%2=1
        System.out.println(sayi2);

        /* 2.Aritmetik Operatörler ---> +,-,*,/,%,++,--
        sayi2++;              sayi2+=1 yazmak yerine 1 artıracaksak bu şekilde kullanımı daha kolay.
        sayi1--;              sayi2-=1 yazmak yerine 1 azaltacaksak bu şekilde kullanımı daha kolay
        */


        // 3.Karşılaştırma operatörleri  --->  Sonucunda boolean tipinde değer döndürürler
        // a==b     a değişkenin değeri b değişkenin değerine eşit mi eşitse true değilse false döndürür. Bunun sonucunu görmek istiyorsak ta ekrana bastırabiliriz
        // a!=b     a değişkenin değeri b değişkenin değerinden farklıysa true değilse false döndürür. İstersek te boolean tipinde bir değişkene bunun sonucunu atarız
        // a<b a<=b a>=b a>b

        int number1 = 20,number2 = 30,number3 = 40;
        System.out.println(number1>number2);
        System.out.println(number1!=number3);
        boolean controlNumber = number1>=number3;
        System.out.println(controlNumber+" sonuç budur.");

        // 4.Mantıksal Operatörler ve Karşılaştırma Operatörleri
        int aValue = 3, bValue = 4, cValue = 5;
        boolean result1 = aValue==bValue;  // false
        boolean result2 = aValue!=bValue;  // true
        boolean result3 = aValue>=cValue;  // false
        boolean result4 = aValue<bValue;   // true

        // AND (&&) ---> Eğer kullanılan ifadelerin hepsi "true" ise "true" değer döndürür onun haricinde false döndürür. İfadelerden biri bile "false" ise "false" değer döndürür.
        // OR (||)  ---> Eğer kullanılan ifadelerden biri bile "true" ise "true" değer döndürür. Bütün ifadelerin değeri "false" ise "false" değer döndürür.
        // NOT (!)  ---> İşlem sonucunun tersini döndürür yani işlemler sonucunda "true" değer dönüyorsa başına "!" koyarsak dönen değer "false" olacaktır.

        boolean result5 = result3 && result4;                                // false
        System.out.println("result5: "+result5);
        System.out.println(!result5);                                        // true
        boolean result6 = result3 || result4;                                // true
        boolean result7 = !((result3 || result4) && (result1 || result2));   // yapacağımız işlem birden fazla ise parantez kullanalım ki işlem önceliğinden hata vermesin.
        System.out.println(result7);                                         // ve parantez kullanarak kodun okunabilirliğini daha çok artıracağız.
        String value1 = result7 ? "Doğru" : "Yanlış";     // Bu kullanım şekli de tanımladığımız bir değişkene değer atamak için koşul kullandırarak değer atıyoruz.
        int value2 = result7 ? 1 : 0;                     // eğer ifadeden "true" dönerse ilk değeri eğer "false" dönerse ikinci değeri değişkene atar.
    }
}