package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			/*  코드를 완성 합니다 */
			System.out.print(">> ");
			String str = scanner.nextLine();
			
			if (str.equals("quit")) {
				break;
			}else{
				String[] s_str = str.split(" ");
				
				switch (s_str[1]) {
				case "+":
					Add add = new Add();
					add.setValue(Integer.parseInt(s_str[0]), Integer.parseInt(s_str[2]));
					System.out.println(">> " + add.calculate());
					break;
					
				case "-":
					Sub sub = new Sub();
					sub.setValue(Integer.parseInt(s_str[0]), Integer.parseInt(s_str[2]));
					System.out.println(">> " + sub.calculate());
					break;
					
				case "*":
					Mul mul = new Mul();
					mul.setValue(Integer.parseInt(s_str[0]), Integer.parseInt(s_str[2]));
					System.out.println(">> " + mul.calculate());
					break;
					
				case "/":
					Div div = new Div();
					div.setValue(Integer.parseInt(s_str[0]), Integer.parseInt(s_str[2]));
					System.out.println(">> " + div.calculate());
					break;

				default:
					System.out.println("잘못된 연산입니다.");
					break;
				}
			}
		}
		scanner.close();
	}
}
