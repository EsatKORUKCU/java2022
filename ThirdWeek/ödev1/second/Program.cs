using System;

namespace YouTubeegitim
{
    class Program
    {
        static void Main(string[] args)
        {
           CreditManager creditManager = new CreditManager(); //  = sol tarafı belleğin stack tarafı sağ tarafı heap kısmı yani referans kısmı
           creditManager.Calculate();
           creditManager.Calculate();
           creditManager.Save();

           Customer  customer = new Customer(); // örneğini oluşturmak, instance oluşturmak, instance creation
           customer.Id = 1;
                     
           customer.City = "Aankara";
           
           CustomerManager customerManager = new CustomerManager(customer);
           customerManager.Save();
           customerManager.Delete();
           
           
           Company company = new Company();
           company.TaxNumber = "100000";
           company.CompanyName = "Arçelik";
           company.Id = 100;

           CustomerManager customerManager2 = new CustomerManager(new Person());

           Person person = new Person ();
           person.NationalIdenty = "";
           person.FirstName = "Engin";
           person.LastName = "Demiroğ";

           Customer c1 = new Customer();
           Customer c2 = new Person();
           Customer c3 = new Company();

           Console.ReadLine();
        }
    }

    class CreditManager
    {
        public void Calculate()
        {
            Console.WriteLine("Hesaplandı");
        }

        public void Save()
        {
            Console.WriteLine("Kredi Veridi.");
        }
    }
        // SOLID
        class Customer
        {
            public Customer() // constractur yapıcı metod
            {
                Console.WriteLine("müşteri nesnesi başlatıldı");
            }

            public int Id {get; set; }
           
            public string City { get; set; }
        }

        class Person : Customer
        {
            public string FirstName { get; set; }
            public string LastName { get; set; }
            public string NationalIdenty { get; set; }
        }

        class Company : Customer
        {
            public string CompanyName { get; set; }
            public string TaxNumber { get; set; }
        }



        // katmanlı mimariler
        class CustomerManager
        {
            private Customer _customer;
            public CustomerManager(Customer customer)
            {
                    _customer = customer;
            }
            public void Save ()
            {
                Console.WriteLine("Müşteri kaydedidi : " + _customer.City);
            }
            public void Delete ()
            {
                Console.WriteLine("Müşteri silindi : " + _customer.City);
            }
        }
    
}