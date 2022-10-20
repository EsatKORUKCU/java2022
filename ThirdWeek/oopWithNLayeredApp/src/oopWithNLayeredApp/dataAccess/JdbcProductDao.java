package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product; // başka pakettten import etmek gerekir(klasörden)


public class JdbcProductDao implements ProductDao { // productdao sınıfının kurallarına uymak zorunda olduğunu gösterir
 public void add(Product product) {
	// sadece ve sadece db erişim kodları buraya yazılır.. SQL
	 System.out.println("JDBC ile veritabanina eklendi");
 }
}
