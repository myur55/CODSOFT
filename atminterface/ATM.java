package atminterface;

import java.util.Scanner;

public class ATM {
	//System.out.println("Total Money in ATM: ");
	Scanner sc = new Scanner(System.in);

	private double money = 85000;
	public void withdraw() {
		System.out.println("You can withdraw money");
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}

}
