
public class Main {
    public static void main(String[] args) {
    System.out.println("hello Word!");
    

    // Değişken isimleri javada camelCase yazılır.
    String ortaMetin = "ilginizi Çekebilir";
    String altMetin = "Vade Süresi";
    System.out.println(ortaMetin);

    //integer
    int vade = 12;
    double dolarDun = 18.25;
    double dolarBugun = 18.30;

    boolean dolarDustumu = false;
    String okYonu = "";

    if (dolarBugun<dolarDun) {
        okYonu ="down.svg";
        System.out.println(okYonu);
    } else if (dolarBugun>dolarDun) {
        okYonu ="up.svg";
        System.out.println(okYonu);
    }
    else {
        okYonu ="equal.svg";
        System.out.println(okYonu);
    }

    //array

    String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu emekli" };

    
    for (int i=0; i<krediler.length; i++){
        System.out.println(krediler[i]);
    }

        }
}


