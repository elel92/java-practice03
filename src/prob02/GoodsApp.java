package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Goods[] goods = new Goods[3];
		
		for(int i = 0; i < COUNT_GOODS; i++) {
			String s = scanner.nextLine();
			String[] d = s.split(" ");
			
			goods[i] = new Goods(d[0], Integer.parseInt(d[1]), Integer.parseInt(d[2]));
		}
		
		for(int i = 0; i < COUNT_GOODS; i++) {
			goods[i].print();
		}
		
		scanner.close();
	}
}