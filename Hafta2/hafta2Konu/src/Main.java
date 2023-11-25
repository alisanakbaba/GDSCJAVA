import java.util.Scanner;

public class Main {

    int a = 5;
    // Main metodu sınırları dışarısında kalan kısımlar Main sınıfına ait.
    public static void main(String[] args) {

        /*
                                            KOD BLOKLARI
        - İki küme parantezi “{“ ve “}” arasında kalan kod kesimine blok (scope) denir.
        - “{“ işareti bir kod bloğu başlatır ve “}” işareti başlatılan kod bloğunu bitirir.Bu işaretler kodun sınırlarını belirlemekte kullanılır.
        - Herhangi bir değişken, tanımlandığı kod bloğu içinde fiziksel olarak vardır ve o kod bloğu içine yazılan kod kesimlerinden erişilebilirdir.
        - Bir blok içinde aynı değişken adı birden fazla kez kullanılamaz.
        - İç içe bir kod yapısını ve ögelerin bir birilerine aitlik durumlarını kod blokları ile sağlarız.
        - Ayrıca her kod bloğundan sonra bir tab boyutunda boşluk bırakılır.
        - Bunun sebebi kodun okunabilirliğini arttırmaktır. Kodun okunabilirliği bir yazılımcı için çok önemli bir noktadır.
        */

        System.out.println("Burası main metoduna ait sınırlardır.");

        int a = 4;
        System.out.println("a: "+a);

        /*
        - Burada main metodu içerisinde tanımlanan "a"  değişkeninin geçerli olacaktır ama bu değişkenimizi bu metot sınırları dışında kullanamayacaz.
        - Eğer main metodu içerisinde yeniden "a" değişkenini tanımlamasaydık ve "a" nın başına static yazsaydık ekrana yazdıracağımız değer "a = 5" olacaktır.
        */

        // Kötü Kod,Temiz Kod --> bütün komutların satır başı olması "Kötü kod"dur . Girintili olacak şekilde olması "Temiz kod" dur.


        /*
                                        İF-ELSE BLOKLARI
        - If ve Else Blokları Java'da mantıksal ve koşullu ifadeler için if blokları kullanılır.
        - Java 'da if blokları Türkçede "eğer" cümlesinin verdiği anlamla aynı şeyi ifade etmektedir.
        - Programlamada koşul oluşturmak için if ve else bloklarını kullanırız.
        - Else deyimi "değil ise" anlamı katmaktadır ve if deyiminden sonra kullanılır.
        - Programlama da if ve else deyimleri çok önemlidir ve kodlamanın temel yapı taşlarını oluştururlar.
        - If ve Else blokları ile programımız içerisinde ki algoritmalarımızı oluştururuz.
        - Koşula göre program içinde farklı işlemleri yerine getirmek gerekebilir.
        - If-else muhtemelen yazılım programlarında en yaygın kullanılan karar mekanizmasıdır.
        - Bu tarz durumları Java'da kodlayabilmek için if-else karar mekanizmasının yanında switch-case gibi yapılarda kullanılmaktadır.
        - İf-else karar mekanizması istenilen koşul gerçekleştiği takdirde çalışır. Kısacası belirlenen koşul doğruysa yazılan kod çalışır.
        - Java'da Karar Mekanizmaları
        - Java'da koşullu ifade ve şart oluşturmak için if ve else kullanılırız. Ayrıca else if, switch gibi koşullu ifadelere sahiptir.
        - Programımızda belirtilen bir koşul doğruysa yürütülecek bir kod bloğu belirtmek için if kullanılır.
        - Aynı koşul yanlışsa yürütülecek bir kod bloğu belirtmek için else deyimi kullanılır.
        - İlk koşul yanlışsa, test edilecek yeni bir koşul belirtmek için eğer if else deyimi kullanılır.
        - Yürütülecek birçok alternatif kod bloğu belirtmek için switch deyimi kullanılır.
         */

        // örneğin sayı 0 dan büyükse pozitif yazıcak
        int number=22;
        if (number>0){
            System.out.println("Sayı pozitif");
        }
        //Koşulun gerçekleşip gerçekleşmediği "if" cümlesi içindeki ifadeye bağlıdır. Eğer mantıksal ifade true ise "if" kod bloğu çalıştırılır.
        // Tabi ifadenin false döndüğü durumda da programın bir şeyler yapmasını isteyebiliriz. Bu durumda ise "else" ifadesi kullanılır.

        if (number>0){
            System.out.println("Sayı pozitif");
        }else {
            System.out.println("Sayı pozitif değil");
        }

        /*
        - else-if kalıbında, bir if satırı, istediğiniz sayıda else-if satırı ve isteğe bağlı olarak tanımlanan bir else satırı bulunur. Yani, else satırının tanımlanması şart değildir.
        - Program, en başta yer alan if satırı ile if-else-if kalıbını değerlendirmeye başlar. İlk doğru ifadenin bulunduğu if veya else-if satırı ile karşılaştığında ilgili işlem satırını çalıştırır.
        - Kalıbın geri kalan tüm satırlarını değerlendirmeye almadan geçer. Eğer if ve else if satırlarında yer alan ifadelerden hiç biri doğru bir sonuç vermezse, else satırında yer alan işlem satırını çalıştırır.
        - else satırı da mevcut değilse, program if-else-if kalıbının hiç bir satırını çalıştırmadan bir sonraki satırdan çalışmasına devam eder. if-else-if kalıbında sadece tek bir satır işlem görür.
        */

        if (number>0){
            System.out.println("Sayı pozitiftir.");
        } else if (number==0) {
            System.out.println("Sayı 0 a eşittir.");
        }else {
            System.out.println("Sayı negatiftir.");
        }

        // istersek birden fazla if i de programımız gereğince kullabiliriz ama bunun yerine &&(and) veya ||(or) kullanarak şartları bu şekilde karşılaştırmalıyız.

        if ((number>0) || (number==0)){
            System.out.println("Sayı Negatif değil");
        }else {
            System.out.println("Sayı Negatif");
        }

        // örnek
        Scanner input = new Scanner(System.in);
        int sayi1,sayi2,sayi3;
        boolean result2;

        System.out.print("Sayı1 in değerini giriniz: ");
        sayi1=input.nextInt();
        System.out.print("Sayı2 in değerini giriniz: ");
        sayi2=input.nextInt();
        System.out.print("Sayı3 in değerini giriniz: ");
        sayi3=input.nextInt();

        // iç içe kod blokları ---> if - else if - else kullanımı bu şekilde de olabilir.
        if ((sayi1<=sayi2) && (sayi1<=sayi3)){
            if (sayi2<=sayi3){
                System.out.println(sayi1+" - "+sayi2+" - "+sayi3);
            }else {
                System.out.println(sayi1+" - "+sayi2+" - "+sayi3);
            }
        } else if ((sayi2<=sayi1) && (sayi2<=sayi3)) {
            if (sayi1<=sayi3){
                System.out.println(sayi2+" - "+sayi1+" - "+sayi3);
            }else {
                System.out.println(sayi2+" - "+sayi3+" - "+sayi1);
            }
        }else {
            if (sayi1<=sayi2){
                System.out.println(sayi3+" - "+sayi1+" - "+sayi2);
            }else {
                System.out.println(sayi3+" - "+sayi2+" - "+sayi1);
            }
        }

        // boolean ile kullanımı
        result2 = (sayi1==sayi2) && (sayi1==sayi3) && (sayi2==sayi3);
        if (result2) {
            System.out.println("Girilen sayıların hepsi birbirine eşittir.");
        }

        //      Switch-Case yapısı

        /*
        - Java'da birden çok kod bloğunu koşullara bağlamak için "switch" deyimi kullanılır.
        - Switch Case; tanımlanmış olan yalnızca bir değişkenin, alacağı değerlere bağlı olarak, farklı sonuçlar döndürmesini sağlayan bir yapıdır.
        - Switch kısmında kullanılacak olan değişkenler byte, short, int, char veya String veri tipine sahip olmalıdır.
        - Switch Case ifadeleri, çalışma mantığı açısından baktığımızda If - Else-if ifadeleri ile benzerlik göstermektedir.
          Ancak çok fazla koşul gerektiren durumlarda If - Else-if ifadelerinin yerine Switch ifadelerini tercih edebiliriz.
          Bu sayede uzun kod satırlarının aksine daha sade ve düzenli bir görünüm elde edebilir ve kodumuzun okunabilirliğini artırmış oluruz.
        Not: "switch-case" yapısında eğer her case'in sonuna "break" ifadesi koymazsak aramış olduğu koşulu bulana kadar tüm case'lere girip o kod bloklarını çalıştıracaktır.
         */

        // Hangi gün olduğunu bulma
        int gun = 2;
        switch (gun){
            case 1:
                System.out.println("Bugün Pazartesi");
                break;
            case 2:
                System.out.println("Bugün Salı");
                break;
            case 3:
                System.out.println("Bugün Çarşamba");
                break;
            case 4:
                System.out.println("Bugün Perşembe");
                break;
            case 5:
                System.out.println("Bugün Cuma");
                break;
            case 6:
                System.out.println("Bugün Cumartesi");
                break;
            case 7:
                System.out.println("Bugün Pazar");
                break;
            default:
                System.out.println("Geçerli bir gün girmediniz");
                break;
        }




    }

}