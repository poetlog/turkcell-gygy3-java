//katmanlý mimariler
public class CustomerMenager {
	
	private Customer _customer;
	private ICreditMenager _creditMenager;
	
	public CustomerMenager(Customer customer,ICreditMenager _creditMenager) {
		this._customer=customer;
		this._creditMenager=_creditMenager;
	}
	
	
	public void Save() {
		System.out.println("Müþteri kaydedildi : ");
	}
	
	public void Delete() {
		System.out.println("Müþteri Silindi : ");
	}
	
	public void GiveCredit() {
		_creditMenager.Calculate();
		System.out.println("kredi verildi");
	}

}
