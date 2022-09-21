package stringsDemo;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        /* 
        System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5.eleman : " + mesaj.charAt(4)); // kaçıncı eleman isteniyorsa
        System.out.println(mesaj.concat(" Yaşasın!")); // ekleme yapmak için kullanılır.
        System.out.println(mesaj.startsWith("B")); // b ile baslıyor mu
        System.out.println(mesaj.endsWith("."));  // . nokta ile  bitiyor mu
        // 5 katakterlik char dizisi oluşturduk.sıfırıncı karakterden başla beş karakteri karakterler dizesine o karakterden başlayarak yaz.daha sonra çıktı al.
        char[] karakterler = new char[5]; 
        mesaj.getChars(0, 5, karakterler, 0); 
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));// a kaçıncı karakter oldugunu yazdır.Baştan aramaya başlar
        System.out.println(mesaj.lastIndexOf('a')); // e kaçıncı karakter oldugunu yazdır.Sondan aramaya başlar
         */
    
        String yeniMesaj = mesaj.replace(' ', '-');// değiştirme
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));// ikinci indexten  beşe kadar yazmaya başlar

        for(String kelime : mesaj.split(" ")){ // metinleri keser dizi haline getirir.
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); // tüm harler küçük olur
        System.out.println(mesaj.toUpperCase()); // tüm harfler büyük olur
        System.out.println(mesaj.trim()); // baş ve sondaki boşlukları atar kaldırır.
    }
}
