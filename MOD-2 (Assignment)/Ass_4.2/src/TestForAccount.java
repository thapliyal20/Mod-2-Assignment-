import java.util.Scanner;


public class TestForAccount {
	Scanner s = new Scanner(System.in);
	static long accNum=1000L;
	
	public static void main(String[] args) {
		Account acc1=new CurrentAccount();
		Account acc2=new SavingAccount();
		Person smith=new Person();
		Person kathy= new Person();
		
		smith.setName("Smith");
		smith.setAge(45.0f);
		acc1.setAccNum(accNum++);
		acc1.setBalance(2000);
		acc1.setAccHolder(smith);
		
		kathy.setName("Kathy");
		kathy.setAge(23.0f);
		acc2.setAccNum(accNum++);
		acc2.setBalance(3000);
		acc2.setAccHolder(kathy);
		
		acc1.deposit(1000.0);
		acc1.withdraw(6000);
		acc2.withdraw(2000);
		System.out.println("Balance:\nSmith :"+acc1.getBalanceAmt()+
				"\nKathy: "+acc2.getBalanceAmt());
		
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
	}


}
