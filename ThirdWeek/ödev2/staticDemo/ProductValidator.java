package staticDemo;

public class ProductValidator {

    static { // static olan ortamda çalışır.
    System.out.println("Static Yapıcı blok Çalıştı");
    }
    public ProductValidator(){ // ilgili klasta newleyince çalışır contraktır klası bu bir constraktır clası
        System.out.println("Yapıcı blok çalıştı");
    }

    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){  // price sıfırdan büyüyk ve name içi yazıyorsa true döndür
            return true;
        }else {
            return false;
        }
    }

    public void Bişey(){

    }

    
}
