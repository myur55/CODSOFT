package atminterface;

import java.util.HashMap;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        AbcBank bank = new AbcBank();
    }
}

class Data {
	float balance;	
}

class AbcBank {
    float balance;
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Data> login = new HashMap<>(); // <accno / dataobj>

    AbcBank() {
        System.out.println("Welcome to Abc Bank");
        start();
    }

    public void start() {
        System.out.println("Enter your Account No.");
        int accno = getIntInput();
        if (login.containsKey(accno)) {
            Data obj = login.get(accno);
            menu(obj);
        } else {
            System.out.println("Create Account first.");
            System.out.println("Set your Account number.");
            int userAcc = getIntInput();
            Data obj = new Data(); // new account created
            login.put(userAcc, obj); // put it inside the map
            menu(obj);
        }
    }

    public void menu(Data obj) {
        System.out.println("1 . Check your Account balance");
        System.out.println("2 . Deposite Money");
        System.out.println("3 . Withdraw Money");
        System.out.println("4 . Exit");

        int input = getIntInput();
        if (input == 1) {
            accBalance(obj);
            menu(obj);
        } else if (input == 2) {
            deposite(obj);
            menu(obj);
        } else if (input == 3) {
            withdraw(obj);
            menu(obj);
        } else if (input == 4) {
            System.out.println("Thank you for using Abc Bank ATM ");
        } else {
            System.out.println("Invalid Input");
            menu(obj);
        }
    }

    public void accBalance(Data obj) {
        System.out.println("Your balance: " + obj.balance);
    }

    public void deposite(Data obj) {
        System.out.println("Please enter the amount you want to deposit.");
        float amount = getFloatInput();
        obj.balance = obj.balance + amount;
        System.out.println(amount + " RS Deposited Successfully.");
    }

    public void withdraw(Data obj) {
        System.out.println("Please enter the amount you want to withdraw.");
        float amount = getFloatInput();
        if (obj.balance >= amount) {
            System.out.println(amount + " RS Withdrawn Successfully.");
            obj.balance = obj.balance - amount;
        } else {
            System.out.println("You don't have enough balance in your account.");
        }
    }

    private int getIntInput() {
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            sc.next();
        }
        return sc.nextInt();
    }

    private float getFloatInput() {
        while (!sc.hasNextFloat()) {
            System.out.println("Please enter a valid amount.");
            sc.next();
        }
        return sc.nextFloat();
    }
}
