package encapsulation;

public class account {
	private String name;
	private long accNumber;
	private double initialBalance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	public double getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}
	public void withdraw(int amount) {
		System.out.println("Your account balance:"+amount);
	}

}
