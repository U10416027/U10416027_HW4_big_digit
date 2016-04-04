//U10416027	董郡麟

import java.util.Scanner;

public class UseBigDigit{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("輸入兩個要加起來的大數");
		System.out.println("-------------------------------");
		String num1 = input.nextLine();
		String num2 = input.nextLine();
		
		BigDigit digit = new BigDigit(num1, num2);
		
		digit.setFitstnum();
		digit.setSecondnum();
		digit.setNumplus();
		digit.setResult();
		
		System.out.println("-------------------------------");
		System.out.println("相加後的結果是");
		System.out.println("-------------------------------");
		digit.setPrintResult();
		System.out.println("-------------------------------");
	}
}
