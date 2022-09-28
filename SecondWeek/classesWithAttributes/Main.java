package classesWithAttributes;

public class Main {
    public static void main(String[] args) {
       // Product product = new Product (1,"Laptop","Asus Laptop,300,2,siyah") // Constructor'ında yazdıgımız için burda direk yazıyoruz degerleri
        Product product = new Product(); // Tanımlanan isim özellik v.b. nitelikler ilgili clas çagrılır ve yazılır
        product.setName("Laptop");  // name yazılır.
        product.setId(1); 
        product.setDescription("Asus Laptop"); 
        product.setPrice(5000);
        product.setStockAmount(3);

        ProductManager productManager=new ProductManager();// productmanagerdeki yazdırma işlemi ekrana yazdırırı
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}
