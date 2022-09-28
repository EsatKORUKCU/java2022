package classesWithAttributes;

public class ProductManager {
    public void Add(Product product) { // product daki name eklenen deger çagrılır
        //JDBC
        System.out.println("Ürün eklendi " + product.getName()); // name degeri yazdırma işlemi yapılır.Çıktıyı main clasından yapacak
    }

    public void Add2(int id,String name,String description,int stockAmount,double price,String yeniÖzellik) {
        
    }
}
