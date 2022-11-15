package overriding;

public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[]// array oluşturduk ne kadar klas varsa ekledik aşagıda da tüm hesaplamaları yazdırdık.
        {new OgretmenKrediManager(), new TarımKrediManager(),new OgrenciKrediManager()};

        for(BaseKrediManager krediManager : krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }

        // OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        // System.out.println(ogretmenKrediManager.hesapla( 1000));
    }
}
