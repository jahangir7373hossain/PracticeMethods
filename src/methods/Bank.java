package methods;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	public static void main(String[] args) {
		
		
		List<BankAccount> accList = new ArrayList<BankAccount>();
		accList.add(new BankAccount(1, 10));
		accList.add(new BankAccount(2, 20));
		accList.add(new BankAccount(3, 30));
		accList.add(new BankAccount(4, 40));
		accList.add(new BankAccount(5, 50));
		
		getLagestSum(accList);
		

	}
	
	public static void getLagestSum(List<BankAccount> list) {
		
		int accountNumber = 0;
		int highestAmount = 0;
		
		for(int i = 0; i < list.size(); i++) {
			
			if(highestAmount < list.get(i).getMoney()) {
				highestAmount = list.get(i).getMoney();
				accountNumber = list.get(i).getAccountNumber();
			}
		}
		System.out.println("Acount number is: " + accountNumber + " and " + "higest amount is: $" + highestAmount);
	}

}
