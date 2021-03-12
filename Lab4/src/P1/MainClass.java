package P1;

public class MainClass {
	public static void main(String[] args) {
		
		Person p = new Person("Smith");
		Account a = new Account(1234,2000, p);
		
		Person p1 = new Person("Kathy");
		Account a1 = new Account(1834,3000, p1);
		
		a.deposit(2000);
		a1.withdraw(2000);
		
		MainClass acc = new MainClass();
		
		SavingsAccount sac = new SavingsAccount();
		acc.accountUser(sac);
		
		CurrentAccount cac = new CurrentAccount();
		acc.accountUser(cac);
	}

	public void accountUser(Account acc)
	{
		if(acc instanceof SavingsAccount)
		{
			SavingsAccount s = (SavingsAccount)acc;
			s.withdraw(4000);
		}
		else if(acc instanceof CurrentAccount)
		{
			CurrentAccount c = (CurrentAccount)acc;
			c.withdraw(2000);
		}
	}
}
