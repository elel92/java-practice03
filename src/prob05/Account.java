package prob05;

public class Account {
	String acc_number;
	int money;
	
	public Account(String acc_number) {
		this.acc_number = acc_number;
		
		System.out.println(acc_number + " 계좌가 개설되었습니다.");
	}
	
	public String getAccountNo() {
		return acc_number;
	}
	
	public void save(int money) {
		this.money = money;
		System.out.println(acc_number + " 계좌에 " + this.money + "만원이 입금되었습니다.");
	}
	
	public int deposit(int money) {
		this.money = this.money - money;
		System.out.println(acc_number + " 계좌에 " + money + "만원이 출금되었습니다.");
		return money;
	}
	
	public int getBalance() {
		return money;
	}
}
