package classes;

public class Main {
    public static void main(String[] args) {
        // referance type
        CustomerManager customerManager = new CustomerManager(); // class çagırmak için kullanılır ilk cus clas ismi ikinci cus ismi herhangi başka bir şey yazabiliriz üçüncü çagrırma için
        CustomerManager customerManager2 = new CustomerManager(); // class cus2 oluşturduk.
        customerManager = customerManager2; // cus2nin referans numarasını cus aktarışdı.
        customerManager.Add();  // CustomerManager clası içindeki add çagırmış olduk.
        customerManager.Remove();// CustomerManager clası içindeki remove çagırmış olduk.
        customerManager.Update();// CustomerManager clası içindeki update çagırmış olduk.
    
        //value
        int sayi1 = 10; // sayi1 'e 10 degeri atandı
        int sayi2 = 20; // sayi2 'e 20 degeri atandı
        sayi2 = sayi1;  // sayı2 degeri sayı1 degeri olan 10 olarak degişti
        sayi1 = 30;
        System.out.println(sayi2); // degeri değişen sayı2 10 olarak yazıldı

        int[] sayilar1 = new int[]{1,2,3};// array tipinde oluşturuldu
        int[] sayilar2 = new int[]{4,5,6};// array tipinde oluşturuldu
        sayilar2 = sayilar1; // sayılar2 nin refaransı sayılar1'ine yönlendirildi aynı refarnsı aldı.
        sayilar1[0] =10; // sayılar1'in sıfırıncı elemanı degeri 10 olarak atandı.
        System.out.println(sayilar2[0]); // sayılar2 sayılar1'in refaransını yönlendiği için sayılar1'in sıfırıncı degeri olan 10 yazıldı.
    
    }
}
