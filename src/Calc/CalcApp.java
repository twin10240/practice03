package Calc;

import java.util.Scanner;

public class CalcApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			/*  코드를 완성 합니다 */
			System.out.print(">>");
			String str = scanner.nextLine();
			
			if (str.equals("quit")) {
				break;
			}else{
				String[] s_str = str.split(" ");
				
				Arith arith = null;
				
				switch (s_str[1]) {
				case "+":
					arith = new Add();
					break;
					
				case "-":
					arith = new Sub();
					break;
					
				case "*":
					arith = new Mul();
					break;
					
				case "/":
					arith = new Div();
					break;
				}
				
				if (arith == null) {
					System.out.println(">>지원 안하는 연산");
					continue;
				}
				
				int lValue = Integer.parseInt(s_str[0]);
				int rValue = Integer.parseInt(s_str[2]);
				arith.setValue(lValue, rValue);
				
				int result = arith.calculate();
				System.out.println(">>" + result);
			}
		}
		scanner.close();
	}
}