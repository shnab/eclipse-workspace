package streamProje01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //Ogrenci classindan liste olusturduk.
    private static List<Ogrenci> ogrListesi = new ArrayList<>();

    public static void main(String[] args) {

        testOgrenciOlustur();
        ismeGoreListele("ahmet");
        ismeGoreListele("Ayşe");
        ismeGoreListele("john");
        System.out.println("=============");
        soyIsmeGoreListele("Can");
        soyIsmeGoreListele("Veli");
        System.out.println("=============");
        cinsiyeteGoreListele("kadın");

    }
    //ilk once bu methodu yazdik,
    // sonra yukarida ogrListesi olusturup asagida ona ogrenci ekledik.
    // ismeGoreListele methodu ile cagirdik
    private static void testOgrenciOlustur(){
//       Ogrenci ogr1 = new Ogrenci("Ahmet", "Can", 30, 88.4, "erkek");
//        ogrListesi.add(ogr1);
        ogrListesi.add(new Ogrenci("Ahmet", "Can", 30, 95.5, "erkek"));
        ogrListesi.add(new Ogrenci("Ahmet", "Baki", 18, 90.1, "erkek"));
        ogrListesi.add(new Ogrenci("Ayşe", "Can", 21, 82.3, "kadın"));
        ogrListesi.add(new Ogrenci("Mustafa", "Can", 15, 75.4, "erkek"));
        ogrListesi.add(new Ogrenci("Ayşe", "Yılmaz", 40, 45, "kadın"));
        ogrListesi.add(new Ogrenci("Ali", "Veli", 80, 35.5, "erkek"));
        ogrListesi.add(new Ogrenci("Veli", "Öztürk", 20, 95.5, "erkek"));
    }
    private static void ismeGoreListele(String isim){
        ogrListesi.parallelStream(). //stream(). ==> burada parallelStream() de kullanilabiliyor Performans artrirmak icin
                filter(t->t.getAd().equalsIgnoreCase(isim)).
                forEach(System.out::println);
    }

    private static void soyIsmeGoreListele(String soyisim) {
        ogrListesi.stream().
                filter(t->t.getSoyad().equalsIgnoreCase(soyisim)).
                forEach(System.out::println);
    }
    private static void cinsiyeteGoreListele(String cinsiyet) {
        ogrListesi.stream().filter(t->t.getCinsiyet().equalsIgnoreCase(cinsiyet)).forEach(System.out::println);
    }

//    private static void notaGoreSirala() {
//        ogrListesi.stream().filter(t -> t.getDiplomaNotu()).forEach(System.out::println);
//    }




//    yasaGoreSirala();
//    sinifOrtalamasiHesapla();
//yasaVeCinsiyeteGoreSirala(20, "erkek");
//    yasaVeCinsiyeteGoreSirala(30, "kadın");

}






//OGRENCI COZUMLERI

//package streamProje01;
//        import java.util.ArrayList;
//        import java.util.Comparator;
//        import java.util.List;
//        import java.util.stream.Collectors;
//public class Main {
//    private static List<Ogrenci> ogreciListesi = new ArrayList();
//    private static List<Ogrenci> tempList = new ArrayList<>();
//    public static void main(String[] args) {
//        testOgrenciOlustu();
//        System.out.println("=======Isme gore listele=======");
//        ismeGoreListele("ahmet");
//        System.out.println("=======Isme gore listele gecersiz isim ile deneme=======");
//        ismeGoreListele("john");
//        System.out.println("=======Soy isme gore listele=======");
//        soyIsmeGoreListele("can");
//        System.out.println("=======Soy isme gore listele gecersiz soyisim ile deneme=======");
//        soyIsmeGoreListele("mehmet");
//        System.out.println("=======Cinsiyete gore listele=======");
//        cinsiyeteGoreListele("erkek");
//        System.out.println("=======Cinsiyete gore listele gecersiz cinsiyet ile deneme=======");
//        cinsiyeteGoreListele("belirtmek istemiyorum");
//        System.out.println("=======Diploma Notuna gore sirala (artan)=======");
//        notaGoreSiralaArtan();
//        System.out.println("=======Diploma Notuna gore sirala (azalan)=======");
//        notaGoreSiralaAzalan();
//        System.out.println("=======Yasa gore sirala (artan)=======");
//        yasaGoreSiralaArtan();
//        System.out.println("=======Yasa gore sirala (azalan)=======");
//        yasaGoreSiralaAzalan();
//        System.out.println("=======Sinifin ortalama diploma notu=======");
//        sinifinOrtalamaDiplomaNotu();
//    }
//    private static void testOgrenciOlustu() {
//        ogreciListesi.add(new Ogrenci("Ahmet", "Can", 30, 95.5, "erkek"));
//        ogreciListesi.add(new Ogrenci("Ahmet", "Baki", 18, 90.1, "erkek"));
//        ogreciListesi.add(new Ogrenci("Ayse", "Can", 21, 82.3, "kadin"));
//        ogreciListesi.add(new Ogrenci("Mustafa", "Can", 15, 75.4, "erkek"));
//        ogreciListesi.add(new Ogrenci("Ayse", "Yilmaz", 40, 45, "kadin"));
//        ogreciListesi.add(new Ogrenci("Ali", "Veli", 80, 35.5, "erkek"));
//        ogreciListesi.add(new Ogrenci("Veli", "Ozturk", 20, 95.5, "erkek"));
//    }
//    /* isim, soyisim ve cinsiyet'e gore siralama yaparken ilk basta bir tempList olusturuyorum
//    Olusturma sebebim en sonda verdigim argument'e gore veri var mi yok mu diye kontrol etmek icin
//    varsa yazdir yoksa "veri bulunamadi" yazdir diyebilmek icin.
//     */
//    private static void ismeGoreListele(String isim) {
//        tempList = ogreciListesi.stream().filter(t -> t.getAd().equalsIgnoreCase(isim)).collect(Collectors.toList());
//        // buradaki if else'i bir method olarak da olusturabilirdik ama boyle yazmak daha cok hosuma gitti :)
//        if (tempList.isEmpty()) {
//            System.out.println(isim + " ismine ait veri bulunamamistir.");
//        } else {
//            for (Ogrenci each :
//                    tempList) {
//                System.out.println(each);
//            }
//        }
//    }
//    private static void soyIsmeGoreListele(String soyIsim) {
//        tempList = ogreciListesi.stream().filter(t -> t.getSoyad().equalsIgnoreCase(soyIsim)).collect(Collectors.toList());
//        // buradaki if else'i bir method olarak da olusturabilirdik ama boyle yazmak daha cok hosuma gitti :)
//        if (tempList.isEmpty()) {
//            System.out.println(soyIsim + " soy ismine ait veri bulunamamistir.");
//        } else {
//            for (Ogrenci each :
//                    tempList) {
//                System.out.println(each);
//            }
//        }
//    }
//    private static void cinsiyeteGoreListele(String cinsiyet) {
//        tempList = ogreciListesi.stream().filter(t -> t.getCinsiyet().equalsIgnoreCase(cinsiyet)).collect(Collectors.toList());
//        // buradaki if else'i bir method olarak da olusturabilirdik ama boyle yazmak daha cok hosuma gitti :)
//        if (tempList.isEmpty()) {
//            System.out.println(cinsiyet + " cinsiyetine ait veri bulunamamistir.");
//        } else {
//            for (Ogrenci each :
//                    tempList) {
//                System.out.println(each);
//            }
//        }
//    }
//    private static void notaGoreSiralaArtan() {
//        ogreciListesi.stream() // sorted methodunu kullanarak ve Comparator class'indan yardim alarak siraliyorum
//                .sorted(Comparator.comparing(Ogrenci::getDiplomaNotu))
//                .forEach(System.out::println);
//    }
//    private static void notaGoreSiralaAzalan() {
//        ogreciListesi.stream() // sorted ile siraliyorum reversed ile tersine ceviriyorum
//                .sorted(Comparator.comparing(Ogrenci::getDiplomaNotu).reversed())
//                .forEach(System.out::println);
//    }
//    private static void yasaGoreSiralaArtan() {
//        ogreciListesi.stream() // sorted methodunu kullanarak ve Comparator class'indan yardim alarak siraliyorum
//                .sorted(Comparator.comparing(Ogrenci::getYas))
//                .forEach(System.out::println);
//    }
//    private static void yasaGoreSiralaAzalan() {
//        ogreciListesi.stream() // sorted ile siraliyorum reversed ile tersine ceviriyorum
//                .sorted(Comparator.comparing(Ogrenci::getYas).reversed())
//                .forEach(System.out::println);
//    }
//    private static void sinifinOrtalamaDiplomaNotu() {
//        // avarage methodu bana bir deger dondurecegi icin ya
//        // return etmemiz lazim ya da direkt sout icine yazmamiz lazim
//        // return edersek OptionelDouble data turunu kullanmamiz gerekecek.
//        // return edersek de main method icerisinde tekrardan sout icine yazmamiz gerekecek
//        // bana en mantikli gelen yontem budur.
//        // NOT: bu sekilde yazdirinca sonuc "OptionalDouble[74.18571428571428]" seklinde olacaktir
//        System.out.println(ogreciListesi.stream()
//                .mapToDouble(Ogrenci::getDiplomaNotu)
//                .average());
//    }
//}


//BASKA BIR COZUM
//package lambda.stream_proje;
//
//        import java.util.ArrayList;
//        import java.util.Comparator;
//        import java.util.List;
//        import java.util.OptionalDouble;
//        import java.util.stream.Collectors;
//
//public class Main {
//
//    private static final List<Ogrenci> ogrenciListesi = new ArrayList<>();
//    private static List<Ogrenci> result;
//
//    public static void main(String[] args) {
//
//        testOgrenciOlustur();
//        ismeGoreListele("ahmet");
//
//        soyIsmeGoreListele("Ali");
//        cinsiyeteGoreListele("kadin");
//
//        System.out.println("======== Nota gore sirala artan ======== ");
//        notaGoreSirala();
//        System.out.println("======== Nota gore sirala azalan ======== ");
//        notaGoreSirala("true");
//        System.out.println("======== Yasa gore sirala ======== ");
//        yasaGoreSirala();
//
//        System.out.println("======== Sinif ortalamasi ========");
//        sinifOrtalamasiHesapla();
//
//
//    }
//
//    private static void soyIsmeGoreListele(String soyad) {
//        result = ogrenciListesi.stream().
//                filter(t -> t.getSoyad().equalsIgnoreCase(soyad)).collect(Collectors.toList());
//        validator(result);
//    }
//
//    private static void cinsiyeteGoreListele(String cinsiyet) {
//        result = ogrenciListesi.stream().filter(t->t.getCinsiyet().equalsIgnoreCase(cinsiyet)).collect(Collectors.toList());
//        validator(result);
//    }
//
//    private static void notaGoreSirala() {
//        ogrenciListesi.stream().sorted(Comparator.comparing(Ogrenci::getDiplomaNotu)).forEach(System.out::println);
//    }
//    private static void notaGoreSirala(String azalan) {
//        ogrenciListesi.stream().sorted(Comparator.comparing(Ogrenci::getDiplomaNotu).reversed()).forEach(System.out::println);
//    }
//
//    private static void yasaGoreSirala() {
//        ogrenciListesi.stream().sorted(Comparator.comparing(Ogrenci::getYas)).forEach(System.out::println);
//    }
//
//    private static void sinifOrtalamasiHesapla() {
//        OptionalDouble avg = ogrenciListesi.stream().mapToDouble(Ogrenci::getDiplomaNotu).average();
//        System.out.println("Sinif diplama notu ortalamasi = " + avg);
//    }
//
//
//    private static void testOgrenciOlustur() {
//        ogrenciListesi.add(new Ogrenci("Ahmet", "Can", 30, 95.5, "erkek"));
//        ogrenciListesi.add(new Ogrenci("Ahmet", "Baki", 18, 90.1, "erkek"));
//        ogrenciListesi.add(new Ogrenci("Ayşe", "Can", 21, 82.3, "kadın"));
//        ogrenciListesi.add(new Ogrenci("Mustafa", "Can", 15, 75.4, "erkek"));
//        ogrenciListesi.add(new Ogrenci("Ayşe", "Yılmaz", 40, 45, "kadın"));
//        ogrenciListesi.add(new Ogrenci("Ali", "Veli", 80, 35.5, "erkek"));
//        ogrenciListesi.add(new Ogrenci("Veli", "Öztürk", 20, 95.5, "erkek"));
//    }
//
//    private static void ismeGoreListele(String name) {
//        List<Ogrenci> aranan = ogrenciListesi.stream().
//                filter(t -> t.getAd().equalsIgnoreCase(name)).
//                collect(Collectors.toList());
//
//
//    }
//
//    private static void validator(List<Ogrenci> result) {
//        if (result.size() == 0) {
//            System.out.println("Boyle bir ogrenci bulunamadi");
//        } else {
//            result.forEach(System.out::println);
//        }
//    }
//
//}