package Week3;
import org.junit.Test;
import static org.junit.Assert.* ;


public class VendingMachineTest {

	@Test
	public void testInitialBalance() {
		VendingMachine machine  = new VendingMachine();
		assertEquals(0, machine.getBalance()) ;
	} 
	@Test
	public void testInitialRevenue() {
		VendingMachine machine  = new VendingMachine();
		assertEquals(0 , machine.getRevenue());
		}
	@Test 
	public void testInsertCoins() {
		VendingMachine machine  = new VendingMachine();
		machine.insertCoin();
		assertEquals(1, machine.getBalance());
	}
	@Test
	public void testRefund() {
		VendingMachine machine  = new VendingMachine();
		assertEquals(0, machine.refund());
	}
	@Test
	public void testVendFailure() {
		VendingMachine machine  = new VendingMachine();
		assertFalse(machine.vendCandyBar());
	}
	@Test
	public void testVendSuccess() {
	VendingMachine machine  = new VendingMachine();
	machine.insertCoin();
	machine.insertCoin();
	machine.insertCoin();
	assertTrue(machine.vendCandyBar());
	}
}
