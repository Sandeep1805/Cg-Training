package Q3;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestBank {

	public static void main(String[] args) {
		
		AbstractApplicationContext fac =  new FileSystemXmlApplicationContext("src/Q3/spring.xml");
		fac.registerShutdownHook();
		
		BankAccount bankaccount = (BankAccount)fac.getBean("bankAccount");
		BankAccountController bankControl = (BankAccountController)fac.getBean("bankAccountController");
		BankAccountServiceImpl bankService = (BankAccountServiceImpl)fac.getBean(BankAccountServiceImpl.class);
		BankAccountepositoryImpl bankRepo = (BankAccountepositoryImpl)fac.getBean(BankAccountepositoryImpl.class);
		
		bankaccount.toString();
		System.out.println("OPERATIONS : ");
		System.out.println("[1] Deposit");
		System.out.println("[2] Withdraw");
		System.out.println("[3] Get Balance");
		System.out.println("[4] Fund Transfer");
		Scanner n = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		int choice = n.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter deposit amount : ");
			double depositAmount = n.nextDouble();
			bankControl.deposit(bankaccount.getAccountId(), depositAmount);
			break;
		case 2:
			double withdrawAmount = n.nextDouble();
			bankControl.withdraw(bankaccount.getAccountId(), withdrawAmount);
			break;
		case 3:
			bankControl.getBalance(bankaccount.getAccountId());
			break;
		case 4:
			System.out.println("Enter Fund Transfer amount : ");
			double transferAmount = n.nextDouble();
			bankControl.fundTransfer(bankaccount.getAccountId(), choice, transferAmount);
			break;
		default:
		}
		
	}	
}