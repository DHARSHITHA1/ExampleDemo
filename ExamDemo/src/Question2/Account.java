package Question2;
import java.time.LocalDate;

public class Account {
	int accountNumber;
	String accounHolderName;
	LocalDate openedDate;
	double balance;
	public Account() {}
	public Account(int accountNumber, String accounHolderName, LocalDate openedDate, double balance) 
	{
		this.accountNumber = accountNumber;
		this.accounHolderName = accounHolderName;
		this.openedDate = openedDate;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccounHolderName() {
		return accounHolderName;
	}
	public void setAccounHolderName(String accounHolderName) {
		this.accounHolderName = accounHolderName;
	}
	public LocalDate getOpenedDate() {
		return openedDate;
	}
	public void setOpenedDate(LocalDate openedDate) {
		this.openedDate = openedDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		balance=validatebalance(balance);
	}
	public double validatebalance(double balance)
	{
		return (balance>=5000)? balance : 5000;
	}
	

}
