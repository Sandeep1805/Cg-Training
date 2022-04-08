import java.util.*;


class savingsacccount {
	static long id;
	static double balance;
	public savingsacccount(long id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	public static double withDraw(double Amount) {
		return balance-Amount;
	}

	private static double deposit(double Amount) {
		return balance+Amount;
	}
	
}


class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}

class IllegalBankTransactionException extends Exception{
	public IllegalBankTransactionException(String msg) {
		super(msg);
	}
}

public class Exception3 {

	public static void main(String[] args) {
		savingsacccount acc=new savingsacccount(7899456,4000.0);
		try(Scanner sc=new Scanner(System.in)) {
			System.out.print("Enter withDraw Amount :");
			double withDrawAmount = sc.nextDouble();
			if(withDrawAmount>acc.balance) {
				throw new InsufficientBalanceException("Insufficent balance");
			}
			else if(withDrawAmount<0) {
				throw new IllegalBankTransactionException("Illegal bank transaction");
			}
			else
			{
				System.out.println("Your remaining Balance is : "+acc.withDraw(withDrawAmount));
			}
				
		} catch (InsufficientBalanceException e) {
			System.out.println(e);
		}
		catch (IllegalBankTransactionException e) {
			System.out.println(e);
		}

	

}}