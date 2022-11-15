package overriding;

public class BaseKrediManager {
    public double hesapla(double tutar){ // public final double hesapla(double tutar) şkelinde olursa final kelimesi eklenirse burada nasıl tanımlanırsa o şekilde digerleri de kullanır demek oluyo
        return tutar * 1.18;
    }
}
