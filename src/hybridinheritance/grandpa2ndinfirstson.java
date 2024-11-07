package hybridinheritance;

public class grandpa2ndinfirstson extends grandp2ndson{
	void Grandpa2nd1son()  {
		System.out.println("Grandpa2ndson neatworth 7800c");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grandpa2ndinfirstson obj=new grandpa2ndinfirstson();
		obj.Grandpa2nd1son();
		obj.parentTotalnetvalue();
		obj.Grandpa2ndson();

	}

	
}