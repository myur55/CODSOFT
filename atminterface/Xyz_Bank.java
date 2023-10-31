package atminterface;

public class Xyz_Bank {
	public static void main(String[] args) {
		ATM atm = new ATM();
		//System.out.println("Total amount in ATM: " + atm.money);
		atm.setMoney(atm.sc.nextDouble());
		System.out.println("Total amount in ATM is: " + atm.getMoney());
		atm.withdraw();		
	}

}
