package methodOverloading;

public class DortIslem {
    public int topla(int sayi1, int sayi2) {
        return sayi1+sayi2;
    }

    public int topla(int sayi1, int sayi2, int sayi3) { // methodun da overloading aşırı yükleme yapmış olduk.
        return sayi1+sayi2+sayi3;
    }
}