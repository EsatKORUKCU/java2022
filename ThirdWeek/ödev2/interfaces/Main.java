package interfaces;

public class Main {
    public static void main(String[] args) {
     
    CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal()); // customermanager oluştuyoruz newlw
    //customerManager.customerDal = new OracleCustomerDal(); // customermanager deki customurdal çagır
    customerManager.add(); //  çagrılan custumardal daki add yazdırıyor

    }
}
