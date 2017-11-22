
public class SavingAccount extends Account{
		private final double minBalance=500.0;
		
		
		public void withdraw(double amt){
			double balance=super.getBalance();
			if((balance-amt)>minBalance){
				super.withdraw(amt);
			}
			else{
				System.out.println("Not enough balance");
			}
			
		}


		@Override
		public String toString() {
			return "\n\nAccout type= SavingAccount\n "+super.toString();
		}

		
}
