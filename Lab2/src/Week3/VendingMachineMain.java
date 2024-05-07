package Week3;

public class VendingMachineMain {
	public static void main(String[] args) {
		VendingMachine v1 = new VendingMachine();
		//check balance and revenue
		System.out.println("Balance : " + v1.getBalance());
		System.out.println("Revenue : " + v1.getRevenue());
		System.out.println();
		//insert coin and check balance and revenue
		v1.insertCoin();
		System.out.println("Balance : " + v1.getBalance());
		System.out.println("Revenue : " + v1.getRevenue());
		System.out.println();
		//get refund
		System.out.println("Amount : " +  v1.refund());
		System.out.println("Balance : " + v1.getBalance());
		System.out.println("Revenue : " + v1.getRevenue());
		System.out.println();
		//Vending candy bar with no coin
		System.out.println(v1.vendCandyBar());
		System.out.println();
		//vending candy bar with three coin
		v1.insertCoin();
		v1.insertCoin();
		v1.insertCoin();
		System.out.println(v1.vendCandyBar());
		System.out.println("Balance : " + v1.getBalance());
		System.out.println("Revenue : " + v1.getRevenue());
	}
}
