
public class Main {

	public static void main(String[] args) {
		/*
		int sayi1=10;
		 
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;//sağdan doğru eşitleme oldugundan bu durumda stack belleğinde tutulur.
		System.out.println(sayi1);
		*/
		/*
		int[] sayilar1 = {1,2,3};
		int[] sayilar2= {10,20,30};
		
		sayilar1=sayilar2;
		
		sayilar2[0]=1000;//heap belleğinde tutulduğu için sayilar1[0] ın cevabı 1000 olur
		
		System.out.println(sayilar1[0]);
		*/
		/*
		CreditMenager creditMenager = new CreditMenager();
		creditMenager.Calculate();
		creditMenager.Save();
		
		Customer customer=new Customer();//örnegini oluşturmak ,instance oluşturmak ,instance creation.
		customer.id=1;

		customer.city="istanbul";
		
		
		CustomerMenager customerMenager=new CustomerMenager(customer);
		customerMenager.Save();
		customerMenager.Delete();
		
		
		
		Company company = new Company();
		company.taxNumber="2123121";
		company.companyName="arçelik";
		company.id=100;
		
		
		CustomerMenager customerMenager2=new CustomerMenager(new Person());
		
		
		Person person = new Person();
		person.firstName="";
		person.lastName="";
		person.nationalIdentity="";
		
		Customer c1=new Customer();
		Customer c2=new Person();
		Customer c3=new Company();
		*/
		//IoC Container
		CustomerMenager customerMenager=new CustomerMenager(new Customer() , new CarCreditMenager());
		customerMenager.GiveCredit();
		
		
		
	
	}

	

}
