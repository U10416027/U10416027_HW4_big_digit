import java.util.ArrayList;

public class BigDigit{
	
	private ArrayList<Integer> firstnum = new ArrayList<>();
	private ArrayList<Integer> secondnum = new ArrayList<>();
	private ArrayList<Integer> numplus = new ArrayList<>();
	private String bignum1;
	private String bignum2;
	
	public BigDigit(String num1, String num2){
		this.bignum1 = num1;
		this.bignum2 = num2;
	}
	
	public void setFitstnum(){
		for(int i = 0; i < bignum1.length(); i++){
			firstnum.add(Integer.valueOf(String.valueOf(bignum1.charAt(i))));
		}
	}
	
	public void setSecondnum(){
		for(int i = 0; i < bignum2.length(); i++){
			secondnum.add(Integer.valueOf(String.valueOf(bignum2.charAt(i))));;
		}
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
	
	public void setResult(){
		for(int i = 0; i < secondnum.size()-1; i++){
			numplus.add(firstnum.get(i) + secondnum.get(i));
		}
		
		for(int i = 0; i < numplus.size()-1; i++){
			if(numplus.get(i) >= 10){
				
				
				
			}	
		}
		
		
		
		
		
	}
	
	
}
