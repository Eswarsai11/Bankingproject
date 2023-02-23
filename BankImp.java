
public class BankImp implements Bank{
	int balance=5000;
	public BankImp(int balance) {
		this.balance=balance;
	}


	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs:"+amount);
		balance=balance+amount;
		System.out.println("Amount Deposited Succesfully!");

	}

	@Override
	public void withdraw(int amount) {
		System.out.println("Withdraw Rs:"+amount);
		if(amount<=balance) {

			balance=balance-amount;
			System.out.println("Amount withdrawl succesfully");

		}
		else {
			try {
				throw new InsufficientbalanceException("Insufficent funds");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}}

	}

	@Override
	public int getBalance() {

		return balance;
	}


}
