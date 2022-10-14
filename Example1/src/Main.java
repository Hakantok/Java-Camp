
public class Main {

	public static void main(String[] args) {
		
		CreditManager creditManager= new CreditManager();
		creditManager.calculate();
		creditManager.save();
		
		
		
		Customer customer= new Customer();
		customer.Id = 1;
		customer.city = "Ankara";
	
		
		CustomerManager customerManager = new CustomerManager(customer);
			
			customerManager.save();
				
		
		Company company = new Company();
		company.taxNumber = "10000";
		company.companyName= "Arçelik";
		company.Id= 100;
		
		CustomerManager customerManager1 = new CustomerManager(new Person());
		
		Person person = new Person();
		person.Id = 1;
		person.nationalIdentity = "123456";
		
		Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();
        
        CustomerManager customerManager2 = new CustomerManager(new TeacherCreditManager());
        customerManager2.giveCredit();
		
	}
}
