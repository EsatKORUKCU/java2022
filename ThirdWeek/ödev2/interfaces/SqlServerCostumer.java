package interfaces;

public class SqlServerCostumer implements ICustomerDal{
    

        @Override
        public void Add() {
            System.out.println("Sql server eklendi");
        }
            
}
