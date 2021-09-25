package Question2;
import java.time.LocalDate;
public class Test {
	public static void main(String[] args)
	{
		LocalDate d = LocalDate.of(2018,7,18);
		Account a1 = new Account(769,"Tae",d,10000);
		System.out.println(Transaction.deposit(a1, 4300));
		try
		{
			System.out.println(Transaction.withdraw(a1, 5000));
			
			
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
