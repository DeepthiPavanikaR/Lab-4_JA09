package P1;

public class Account {
	long accNum;
	double balance;
	Person acctHolder;
		
	public Account(long accNum, double balance, Person acctHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.acctHolder = acctHolder;
	}
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public Person getAcctHolder() {
		return acctHolder;
	}
	public void setAcctHolder(Person acctHolder) {
		this.acctHolder = acctHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(int amount)
	{
		balance = balance + amount;
		System.out.println(" "+balance);
	}
	public void withdraw(int amount)
	{
		balance = balance - amount;
		System.out.println(" "+balance);
	}
	public double getBalance()
	{
		System.out.println("Available balance :");
		return balance;
	}
}

class SavingsAccount extends Account
{
	long minBalance = 500;

	@Override
	public void withdraw(int amount) {
		if(balance-amount > 500) {
			System.out.println("Available balance :"+(balance-amount));
		}
		else
			System.out.println("Not enough minimum balance ");
	}
}

class CurrentAccount extends Account
{
	long overdraftLimit = 1000;
	Boolean b= false;
	@Override
	public void withdraw(int amount) {
		if(amount> overdraftLimit)
		{
			b=false;
			System.out.println(b);
		}
		else
		{
			b=true;
			System.out.println(b);
		}
	}
	
	
}