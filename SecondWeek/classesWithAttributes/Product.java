package classesWithAttributes;

public class Product {

    public Product(int id, String name, String description, double price, int stockAmount, String renk){ // product'ın  Constructor'ı
        System.out.println("Yapıcı blok çalıştı");
        this.id =id; // Constructor'ı da id set etmiş olduk
        this.renk = renk;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockAmount = stockAmount;
    }

    public Product(){ // prouct overloding aşırı yükleme yapmış olduk.İkinci kez yazdıgımız için

    }

    // attribute | field // özellikleri burada tanımlıyoruz
    private int id;  // normalde public olur yabni heryerden ulaşılabilir fakat private yazıldıgında izne tabi olur.
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;


    //getter
    public int getId() { // id artık sadece okuyabilir izni verildi.
        return id;
    }

    //setter
    public void setId(int id) { // id yazma izni verildi
        this.id = id; // this.id product clasındaki id nin oldugunu belirtmek için
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }

   


}
