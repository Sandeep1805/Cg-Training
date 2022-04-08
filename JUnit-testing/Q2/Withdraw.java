package q2;

public class Withdraw {
	double balance=2000;
	@SuppressWarnings("serial")
	class insufficientbalanceexception extends Exception{
		public insufficientbalanceexception(String msg) {
			super(msg);
		
		}
	}
   public double withdraw(double withdrawam) throws Exception {
	   if(balance>withdrawam) {
		   balance=balance-withdrawam;
		   System.out.println("Current balance after last transaction is:"+balance);
	   }
	   else if(withdrawam>balance) {
		   throw new insufficientbalanceexception("Balance is less than withdrawing amount");
		   
	   }
	   return balance;
   }
}
