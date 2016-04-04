import java.util.ArrayList;

public class BigDigit{
	private ArrayList<Integer> firstnum = new ArrayList<>();
	private ArrayList<Integer> secondnum = new ArrayList<>();
	private ArrayList<Integer> numplus = new ArrayList<>();
	
	public BigDigit(String num1, String num2){
		this.num1 = bignum1;
		this.num2 = bignum2;
	}
	
	public void setFitstnum(){
		for(int i = 0; i < bignum1.length(); i++){
			firstnum.add(bignum1.charAt(i));
		}
	}
	
	public void setSecondnum(){
		for(int i = 0; i < bignum2.lengh(); i++){
			secondnum.add(bignum2.charAt(i));
		}
	}
	
	public void setNumplus(){
		if(bignum1.length() < bignum2.length()){
			for(int i = bignum1.length(); i < bignum2.length(); i++){
				firstnum.add(0);
			}
		}
		
		else if(bignum1.length() > bignum2.length()){
			for(int i = bignum2.length(); i < bignum1.length(); i++)){
				secondnum.add(0);
			}
		}
	}
	
	
	

	
}
