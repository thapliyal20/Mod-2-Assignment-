import java.util.Scanner;
public class CheckPositiveString {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string");
			String string=sc.next();
			AcceptStringAndCompute asc= new AcceptStringAndCompute(string);
			if(asc.isPositive()){
				System.out.println("Not a Positive String");
			}
			else{
				System.out.println("Positive String");
			}
			sc.close();
	}

}
