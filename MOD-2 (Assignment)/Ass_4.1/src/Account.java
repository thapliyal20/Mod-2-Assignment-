
public class Account {
	
	private long accNum;
	private double balance;
	private Person accHolder;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double amt){
		balance+=amt;
		System.out.println("Amount deposited");
	}
	public void withdraw(double amt){
		if(balance-amt>500){
			balance-=amt;
			System.out.println("Amount withdrawn");
		}
		else{
			System.out.println("Not enough balance");
		}
		
	}
	
	public double getBalanceAmt(){
		return balance;
	}
	@Override
	public String toString() {
		return "Account Details [accNum=" + this.accNum + "\n balance=" + this.balance
				+ "\n accHolder Name=" + this.accHolder.getName()+"\n Account holder age= "+this.accHolder.getAge()+ "]";
	}
	
	
	
}
