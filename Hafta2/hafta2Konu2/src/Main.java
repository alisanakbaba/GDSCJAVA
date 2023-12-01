import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //                      DÖNGÜLER
        /* DÖNGÜ YAPILARI
        - Döngüler, belirli bir koşul sağlandığı sürece tekrarlanması gereken işler için kullanılan programlama kodlarıdır.
        - Döngü deyimleri, bahsedilen komut parçalarının belirtilen şartlar gerçekleştikçe tekrar tekrar işlenmesini sağlar.
        - Java’da for, while ve do-while olmak üzere 3 adet döngü deyimi bulunmaktadır.
        - Kısacası : Döngü yapıları kodumuzun belirli kısımlarının döngüye girmesini ve birden fazla kez çalışmasını sağlar.
        - Döngüler bir koşula bağlanır ve bu koşul var olduğu sürece aynı kod bloğu çalışmaya devam eder. Koşul artık sağlanmıyorsa döngü sona erer.
        */

        /* While Döngüsü
        - While döngüsü Java'nın temel yapı taşlarından bir tanesidir.
        - While terimini yazdıktan sonra yanına bir parantez açılıp kapatılır ve bu parantezler arasına boolean bir değer girilir.
        - Sonrasında bir süslü parantez açılıp kapatılır ve bunun içine kod bloğu yazılır.
        - Bu parantezler içindeki değer doğru(true) olduğu sürece döngü dönmeye devam eder ve kod bloğu çalışır.
         */

        /* While döngüsü söz dizimi şu şekildedir ;

        while(kosul){
            //kod bloğu
        }

        - Burada belirtilen koşul, boolean bir ifadedir. Bu koşul true olduğu sürece döngü devam eder. Koşul false olursa döngü sonlanır.
        - Koşul ifadesi parantez içine yazılır.
        - Eğer döngüye girecek kod tek satırdan oluşuyorsa blok açmaya gerek yoktur; fakat birden fazla satırdan oluşuyorsa mutlaka blok açılmalıdır.
         */

        int number1 = 0;
        while (number1<10){           // 0 dan 10 a kadar olan sayıları ekrana basma
            System.out.print(number1+"\t");
            number1++;
        }
        System.out.println();

        // Döngülerin içeriği olmak zorunda değildir. Bazı durumlarda döngüye girecek kod olmasa bile döngüye girebiliriz. Aşağıdaki örneği inceleyelim:
        int left=100,right=200;      // 100 ile 200 sayılarının ortasını bulma
        while (++left<--right);

        System.out.println("Left: "+left+"\nRight: "+right);

        // iç içe döngüler
        int a = 0,b;
        while (a<10){             // her saymada değeri 1 artırarak 10 a kadar sayma
            b=a;
            while (b<10){
                System.out.print(b+"\t");
                b++;
            }
            System.out.println();
            a++;
        }

        // Kullanıcı şifreyi doğru girmediği sürece şifreyi tekrar isteme
        Scanner input = new Scanner(System.in);
        int password;
        boolean isLogin=false;

        while (!isLogin){                // Kullanıcının doğru şifreyi  girmesini sağlamak
            System.out.print("Şifrenizi giriniz: ");
            password=input.nextInt();

            if (password==12345){
                System.out.println("Şifre doğru");
                isLogin=true;
            }else {
                System.out.println("Hatalı şifre tekrar deneyiniz");
            }
        }

        //Yani while döngüsü genellikle işlemin kaç kez tekrar edeceği bilinmediği durumda kullanılır.
        //Java programla dilinde while döngüleri yapacağımız işin ne zaman biteceğiniz bilmediğimiz durumlarda kullanışlı olabilmektedir

        /* Do-While Döngüsü
        - Do-while döngüsünün çalışma mantığı while döngüsü ile aynıdır , fakat while döngüsünde parantez içerisindeki koşul sağlandığı sürece kod bloğu çalışacaktır.
        - Ama Do-while döngüsünde durum false olsa bile döngü en az bir kere çalışacaktır.
        - Bu tür durumlar için Do-while kullanılır.
        - Java Do-While döngüsü söz dizimi şu şekildedir ;

        do {
            kodlar//
        } while (kosul);

        - Gördüğünüz gibi, koşul döngünün sonunda test edilir. Bu durumda, koşul false olsa bile döngü en az bir kere çalıştırılmış olur.
        - Java'da Do-While ve While döngüleri arasındaki tek fark , Do-while döngüsünde, döngü bloğu içindeki kod kesimi en az bir kez mutlaka işletilecektir.
        - Çünkü önce döngü bloğu işletilip sonra koşul denetlenmektedir.
        - While döngüsünde ise önce koşula bakılıp sonra döngü bloğu işletildiği için, döngüye hiç girilmemesi olasıdır.
         */

        int number2=10;
        do {                   // Kodun en az bir kere çalışacağını gösterme
            System.out.println("number2: "+number2);
            number2++;
        }while (number2<10);


        /*          For Döngüsü
        Java'da döngüler konusunda öğrendiğimiz gibi For döngüsü ile bir koşul belirterek döngülerimizi oluşturabiliriz.

        for (durum 1; durum 2; durum 3) {
        // çalışacak kod bloğu
        }

        - For döngüsü şu şekilde işler: İlk olarak döngüde sayaç işlevi görecek bir değişken oluşturulur.
        - Bu değişkenin ilk değeri [durum 1] ile belirtilen kısımda verilir.
        - Bu değişken [durum 3] kısmında isteğe göre artırılır veya azaltılır.
        - Döngünün hangi koşulda çalışacağı ise [durum 2] kısmında boolean bir ifadeyle belirtilir.
         */

        for (int i=0;i<=5;i++){          // 1 den 5 e kadar olan sayıları ekrana basma
            System.out.print(i+"  ");
        }

        System.out.println();     // Ara ara bu gördüklerimiz alt saturdan ekrana basmaya devam etmesi için yazılmıştır

        int i = 0;                        // 1 den 5 e kadar olan sayıları ekrana basma
        while (i<=5){
            System.out.print(i+"  ");
            i++;
        }

        // FOR ile While arasındaki farklar
        /*
        - Java’da for, while ve do-while olmak üzere 3 adet döngü deyimi bulunmaktadır. Birbirinden farklı bu döngülerden hangisini kullanacağız ?
        - Hiç bir algoritmada hangi döngünün kullanılması gerektiği ile ilgili kesin bir yargı ve kural söz konusu değildir.
        - Bu döngüler uygun şekilde tasarlandıkları sürece aynı işi yapabilirler.
        - Ama genellikle, kaç kere döneceği belli olmayan, koşulun bir girdiye göre denetlendiği durumlarda While ya da do-while döngüsü kullanılırken,
        diziler gibi, tekrar sayısı belirli olan durumlarda ise for döngüsü kullanılması tercih edilir. Ama yine bu yazılımcının kendisine bağlıdır.
         */

        System.out.println();
        // Kullanıcının pozitif sayı girmesini sağlamak burada do while en iyi işimize yarayan döngü
        for (boolean isRun=true;isRun;){
            System.out.print("Sayı giriniz: ");
            int sayi = input.nextInt();
            if (sayi>0){
                isRun=false;
            }
        }

        System.out.print("Sayı giriniz: ");
        int sayi2=input.nextInt();
        while (sayi2<=0){
            System.out.print("Sayı giriniz: ");
            sayi2=input.nextInt();
        }

        int sayi3;
        do {
            System.out.print("Sayı giriniz: ");
            sayi3=input.nextInt();
        }while (sayi3<=0);

        // 1 den 5 e kadar olan sayıları ekrana basma   burada for işimize yarayan en iyi döngü
        for (int m=0;m<=5;m++){
            System.out.print(m+" ");
        }
        System.out.println();
        int k=0;
        while (k<=5){
            System.out.print(k+" ");
            k++;
        }
        System.out.println();
        /*   * Continue
         - Java'da "continue" deyimi , döngü içinde bir koşul oluştuğunda o döngüyü tamamlamadan bir sonraki kademeye geçmeye yarar.

            * Break
        - Buraya kadar gördüğümüz bütün döngüler belirlediğimiz bir koşula göre kontrol ediliyor ve bu koşul sağlandığı sürece çalışıyordu.
        - Bazı durumlarda, döngü koşulu sağlansa bile başka bir nedenden ötürü döngüyü sonlandırmak isteyebiliriz.
        - Bu tarz durumlarda break deyimini kullanırız. Bu deyim, içinde kullanıldığı döngüyü anında sonlandırır.
         */

        // 0 den 5 e kadar olan sayılardan 4 hariç ekrana basma
        for (int y=0;y<=5;y++){
            if (y==4){
                continue;
            }
            System.out.print(y+" ");
        }
        System.out.println();
        // 0 den 5 e kadar olan sayılardan 4 ü görünce programı sonlandırma
        for (int j=0;j<=5;j++){
            if (j==4){
                break;
            }
            System.out.print(j+" ");
        }
        // 0 ile 10 arasındaki tek sayıları bulma
        System.out.println();
        for (int d=0;d<=10;d++){
            if (d%2==0){
                continue;
            }
            System.out.print(d+" ");
        }
    }
}