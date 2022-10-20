using System;

namespace YouTubeegitim
{
    class Program
    {
        static void Main(string[] args)
        {
            // Ioc container
          CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
          customerManager.GiveCredit();
           Console.ReadLine();
        }
    }

    class CreditManager
    {
        public void Calculate()
        {
            // sonar qube
            if(creditType == 1)  // esnaf
            {

            }

            if(creditType == 2)  // öğretmen
            {

            }

            Console.WriteLine("Hesaplandı");
        }

        public void Save()
        {
            Console.WriteLine("Kredi Verildi.");
        }
    }

        interface ICreditManager
        {
            void Calculate();
            void Save();
        }
    abstract class BaseCreditManager : ICreditManager   // absrıraklarda tamamlanmış save ve tamamlanmamış calculate class yazılabilir
    {
        public abstract void Calculate(); // her yerde değişkenlik gösterir.
        

        public virtual void Save() // implement edildiği tüm klaslarda otomatik eklenir ve yazılır. virtual save classının istina olarak yazılacak bir class olursa yazarız sanal oluşturmuş oluruz.
        {
            Console.WriteLine("Kaydedidi");
        }
    }

    class TeacherCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate() // abstırak yazdığımız için override yazarsak abtırak kullanmış oluruz.override üstüne yaz demek
        {
            // hesaplamalar
            Console.WriteLine("Öğretmen kredisi hesaplandı");
        }

         public override void Save()  // istisnai durumda yazım şekli
         {
            base.Save();
         }
        
    }

    // DRY
    class MilitaryCreditManager : BaseCreditManager, ICreditManager

    {
        public  override void Calculate()
        {
            Console.WriteLine("Asker kredisi hesaplandı");
        }

       
        
    }

    class carCreditManager : BaseCreditManager, ICreditManager

    {
        public override void Calculate()
        {
            Console.WriteLine("Araba kredisi hesaplandı");
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
            private ICreditManager _creditManager;
            public CustomerManager(Customer customer, ICreditManager creditManager)
            {
                    _customer = customer;
                    _creditManager = creditManager;
            }
            public void Save ()
            {
                Console.WriteLine("Müşteri kaydedidi : " );
            }
            public void Delete ()
            {
                Console.WriteLine("Müşteri silindi : " );
            }

            public void GiveCredit()
            {
                _creditManager.Calculate();
                Console.WriteLine("Kredi veridi");

            }

        }
    
}