package inheritanceconcept;

public class Singleinheritancechild extends SingleInheritance {
	
	void Paymentdetais() {
		String cardname="visa";
		String Bankname="SBI";
		int cvv=678;
		float cardno=1234567890123456f;
		System.out.println("paymentdetails:"+cardname+Bankname+cvv+cardno);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleinheritancechild obj=new  Singleinheritancechild();
		obj.Paymentdetais();
		obj.logindetails();
		

	}

}
