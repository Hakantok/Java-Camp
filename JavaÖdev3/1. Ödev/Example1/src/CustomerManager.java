
public class CustomerManager {

	private  Customer customer;
	private ICreditManager creditManager;	

	
	public CustomerManager(Customer customer){
        this.customer = customer;
    }
	
    public CustomerManager(ICreditManager creditManager) {
        this.creditManager = creditManager;
    }

    public void  save(){
        System.out.println("M��teri kaydedildi. " + customer.city);
    }
    public void  delete(){
        System.out.println("M��teri silindi. " + customer.city);
    }
    
    public void  giveCredit(){
        creditManager.calculate();
        System.out.println("Kredi verildi.");
        creditManager.save();
    }
}
