package Question2;

public class Transaction {
	public static double deposit(Account account,double amount) 
	{
		double balance = account.getBalance();
		account.setBalance(account.getBalance()+amount);
		double tb=balance+amount;
		return tb;
	}
	public static double withdraw(Account account,double amount) throws InsufficientBalanceException
	{
		double balance = account.getBalance();
		if(balance-amount >= 5000)
			return balance-amount;
		else 
			throw new InsufficientBalanceException(balance-amount +"is not sufficient for minimum balance");
	}

}
