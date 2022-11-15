package polymorphismDemo;
 

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){// logger degeri ile gelen hangi log sistemiyese onunla çalış konstraşşın
    this.logger = logger;  // gelen logu logger üzerinden logger atamasını yapıyoruz
     }
    public void add() {
        System.out.println("Müşteri eklendi");
        this.logger.log("Log mesajı"); // hangi logger gönderildi ise oradan gelen ile bu birleşir yazar
    }
}
