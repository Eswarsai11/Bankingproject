import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank bb=new BankImp(5000);

		while(true) {
			System.out.println("1:Deposi\n2:withdraw\n3:checkbalance\n4:Exit");
			System.out.println("Enter choice");
			int choice=sc.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter amount to be deposited");
				int amountToDeposit=sc.nextInt();
				bb.deposit(amountToDeposit);
				break;

			case 2:
				System.out.println("Enter amount to be withdrawn");
				int amountToWithdra=sc.nextInt();
				bb.withdraw(amountToWithdra);
				break;
			case 3:
				System.out.println("Availabel Balance:"+bb.getBalance());
				break;
			case 4:
				System.out.println("Thank You Visit Again");
				System.exit(0);
			default:

				try {
					throw new InvalidChoiceException("Invalid choice");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
				System.out.println("==========");}

		}

	}}
