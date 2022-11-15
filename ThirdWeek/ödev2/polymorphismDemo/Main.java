package polymorphismDemo;

public class Main {
    public static void main(String[] args) {
       
    //    BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(),new ConsoleLogger()};// baselogger şeklibde bir array oluşturudk.içinde üç clası new lemek için kendi klaslarında baselogeerı extends ettik eger extends etmeseydik newleyemezdik.
    //    for(BaseLogger logger:loggers){// bütün koggerları base logger arrayın içine aldı daha sonra for ile hepsine döndi yani for döngüsüsün içinde ne varsa şu an log mesajı vardı hepsini içine aldıgı bütün loggerlara gönderdi ve yazdı.
    //         logger.Log("Log Mesajı");// bütün loglara gönderilen mesaj
    //    }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());// database loglandı.
        customerManager.add();
        // EmailLogger logger = new EmailLogger();// önce emaillaogger buraya oluşturuyoruz. emil içinedkiler ulaşmak için logger oluşuyor
        // logger.Log("Log mesajı");   // logger ile email içindekilere baglantı yaptı ve email içindeki log sınıfına log mesajı verisini gönderdik.
    }
}
