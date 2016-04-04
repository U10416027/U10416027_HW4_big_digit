import java.util.ArrayList;

public class BigDigit{
	private String bignum1;
	private String bignum2;
	private ArrayList<Integer> firstnum = new ArrayList<>();
	private ArrayList<Integer> secondnum = new ArrayList<>();
	private ArrayList<Integer> numplus = new ArrayList<>();
	
	public BigDigit(String num1, String num2){
		this.bignum1 = num1;
		this.bignum2 = num2;
		setFitstnum();
		setSecondnum();
		setNumplus();
		setResult();
	}
	
	public void setFitstnum(){
		for(int i = bignum1.length()-1; i >= 0; i--){
			firstnum.add(Integer.valueOf(String.valueOf(bignum1.charAt(i))));
		}
	}
	
	public void setSecondnum(){
		for(int i = bignum2.length()-1; i >= 0; i--){
			secondnum.add(Integer.valueOf(String.valueOf(bignum2.charAt(i))));;
		}
	}
	
	public void setResult(){
		for(int i = 0; i < firstnum.size(); i++){
			numplus.add(firstnum.get(i) + secondnum.get(i));
		}
		
		for(int i = 0; i < numplus.size()-1; i++){
			if(numplus.get(i) >= 10){
				numplus.set(i, numplus.get(i)%10);
				numplus.set(i + 1, numplus.get(i+1) + 1);
			}	
		}
	}
	
	public void setPrintResult(){
		for(int i = numplus.size() - 1; i >= 0; i--){
			System.out.print(numplus.get(i));
		}
		System.out.println("");
	}
	
	public void setNumplus(){
		if(bignum1.length() < bignum2.length()){
			for(int i = bignum1.length(); i < bignum2.length(); i++){
				firstnum.add(0);
			}
		}
		
		else if(bignum1.length() > bignum2.length()){
			for(int i = bignum2.length(); i < bignum1.length(); i++){
				secondnum.add(0);
			}
		}
		
	}
}
