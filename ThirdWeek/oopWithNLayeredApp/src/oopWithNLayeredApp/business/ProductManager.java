package oopWithNLayeredApp.business;

import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.ListUI;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) { // productManager den ProdouctDao istenince prouctdao ver diyor
		this.productDao = productDao;
		this.loggers = loggers; // Bu classs daki loger  gönderilen loggerdır.
	}



	public void add(Product product) throws Exception {
		 // İş kuralları
        if(product.getUnitPrice()<10){
            throw new Exception("urun fiyati 10 dan kücük olamaz");// bu şart saglanırsa kod hata fırlatır ve program durur.
        }
        
        // Bir katman diğer katmanın classını kullanırken sadece interfacesinden erişim kurmalıdır.
        //ProductDao productDao = new  JdbcProductDao();// Productdao interface onu implement eden HibernateProductDao ve JdbcProductDao refaranslarını aynı anda tutar. 
        productDao.add(product);// data accesse gitti
        
         for (Logger logger : loggers) { //[db,file] //  array loggerları tek tek çözüyor/dolaşıyor ne varsa
        	 logger.log(product.getName()); // product loglardaki metin kısımları getname ise data kısımları
		}
	}
}
