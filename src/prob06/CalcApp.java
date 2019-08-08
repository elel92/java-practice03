package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			System.out.print(">> ");
			String expression = scanner.nextLine();
			
			if("quit".equals(expression)) {
				break;
			}
			
			String[] tokens = expression.split(" ");
			
			if(tokens.length != 3) {
				System.out.println(">> 알 수 없는 식입니다.");
				continue;
			}
			
			if(tokens[1].equals("+")) {
				System.out.println(">> " + new Add(tokens[0], tokens[2]).ans);
			} else if(tokens[1].equals("-")) {
				System.out.println(">> " + new Sub(tokens[0], tokens[2]).ans);
			} else if(tokens[1].equals("*")) {
				System.out.println(">> " + new Mul(tokens[0], tokens[2]).ans);
			} else if(tokens[1].equals("/")) {
				System.out.println(">> " + new Div(tokens[0], tokens[2]).ans);
			}
		}
		
		scanner.close();
	}
}

class Add {
	int ans;
	
	Add(String a, String b) {
		ans = Integer.parseInt(a) + Integer.parseInt(b);
	}
}

class Sub {
	int ans;
	
	Sub(String a, String b) {
		ans = Integer.parseInt(a) - Integer.parseInt(b);
	}
}

class Mul {
	int ans;
	
	Mul(String a, String b) {
		ans = Integer.parseInt(a) * Integer.parseInt(b);
	}
}

class Div {
	double ans;
	
	Div(String a, String b) {
		ans = Integer.parseInt(a) / Integer.parseInt(b);;
	}
}
