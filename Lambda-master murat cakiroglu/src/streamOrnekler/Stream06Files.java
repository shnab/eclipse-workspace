package streamOrnekler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Stream06Files {

    public static void main(String[] args) throws IOException {

        String path = "src/streamOrnekler/mars.txt"; //burada path i String olrak tanimliyoruz.

        Stream<String> satirlar = Files.lines(Path.of(path));
        satirlar.forEach(System.out::println);

        //tum satrilari buyuk harf ile yazdirma
        Files.lines(Paths.get(path)).
                map(t -> t.toUpperCase()). //map(String::toUpperCase).
                forEach(System.out::println);

        //sadece ilk satiri buyuk harf ile yazdrima
        Files.lines(Paths.get(path)).limit(1).map(String::toUpperCase).forEach(System.out::println);

        //3. ve 4. satrilar

        Files.lines(Paths.get(path)).skip(2).limit(2).map(String::toUpperCase).forEach(System.out::println);

        // "bu " kelimesi kac defa geciyor.
        long x = Files.lines(Paths.get(path)).map(String::toLowerCase).filter(t->t.contains("bu")).count();
        System.out.println(x);

//        System.out.println(Files.lines(Paths.get(path)).map(String::toLowerCase).filter(t->t.equals("bu")).count());

        //tum farkli kelimeleri alt alta yazdiralim.
        Files.lines(Paths.get(path)).
                map(t -> t.toLowerCase().split(" ")).
                flatMap(Arrays::stream). //flatMap() tum kelimleri yanyana dizzmeye yariyor.
                distinct(). //tekrar eden kelimeleri cikartiyor
                forEach(System.out::println);


        //M veya m harfi kac tane yazdiralim
//        long mSayisi = Files.lines(Paths.get(path)).map(t -> t.toLowerCase().split("")).
//                flatMap(Arrays::stream).filter(t -> t.contains("m")).count();
        long mSayisi = Files.lines(Paths.get(path)).map(t -> t.toLowerCase().split("")).
                flatMap(Arrays::stream).filter(t -> t.equals("m")).count();
        System.out.println("M harfinin sayisi " + mSayisi); //M harfinin sayisi 19

        //bosluk ve noktalama isaretleri haris dosyada kac adet karakter kullanildigini
        //hesaplayarak yazdiralim
        // \\W "a-z" U "A-Z" U "0-9" U "_" haric tum karakterler demektir.
        System.out.println(
        Files.lines(Paths.get(path)).
                map(t ->t.replace("_", "").replaceAll("\\W", "").split("")).
                flatMap(Arrays::stream).
                count()); //260

    }
}
