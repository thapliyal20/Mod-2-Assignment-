
public class AcceptStringAndCompute {

	String string;
	boolean flag;
	public AcceptStringAndCompute() {
		flag=false;
	}
	public AcceptStringAndCompute(String string) {
		this.string = string;
	}
		
	public boolean isPositive(){
		for(int i=0;i<(string.length())-1;i++)
		{
			if(string.charAt(i)>string.charAt(i+1)){
				flag=true;
				break;
			}
			
		}
		return flag;
	}
}
