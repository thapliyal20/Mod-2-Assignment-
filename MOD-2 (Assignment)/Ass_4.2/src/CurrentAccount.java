
public class CurrentAccount extends Account{
		private final double overDraftLimit=-1000.0;
		
		public void withdraw(double amt){
			double balance=super.getBalance();
			if((balance-amt)>overDraftLimit){
				super.withdraw(amt);
			}
			else{
				System.out.println("Cant withdraw. OverDraft limit reached");
			}
			
		}
		
		@Override
		public String toString() {
			return "\n\nAccout type= CurrentAccount\n "+super.toString();
		}
		
}
