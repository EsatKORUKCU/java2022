package methods2;

public class Main {
    public static void main(String[] args) {
        String mesaj ="Bugün hava çok güzel";
        String yeniMesaj = sehirVer(); // yenimesaj değişkenine sehirver fonkisyonundaki deger olan ankara degeri atanır.
        System.out.println(yeniMesaj);
        int sayi = topla(5, 7);// topla fonksiyonuna 5 ve 7 degerini gönderir sonucu sayi değikenine atar
        System.out.println(sayi); 
        int toplam = topla2(2,3,4,5,6,10);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1,int sayi2) { // yukarıdaki 5 ve 7 nin içe aktarılmasını saglar
        return sayi1+sayi2; // yukarıdan gönderilen 5 ve 7 nin toplanmasını saglar
    }

    public static int topla2(int... sayilar) { // birden fazla sayıda sayı almak içi int array olarak geldi
       int toplam =0;
       for (int sayi:sayilar) { // sayilar array dizi halinde oldugu için her bir sayı için for döngüsünü kullandık.
        toplam+=sayi;
       }
       return toplam;
    }
    private static String sehirVer() {
        return"Ankara"; // sehirver fonksiyonun yazıldıgı yere ankara degerini gönderir.
    }
}
