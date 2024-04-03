package Week3;
import org.junit.Test;
import static org.junit.Assert.* ;


public class Lab3_Unittest {

	VendingMachine machine  = new VendingMachine();
	@Test
	public void testInitialBalance() {
		assertEquals(0, machine.getBalance()) ;
	}
	
	@Test
	public void testInitialRevenue() {
		assertEquals(0 , machine.getRevenue());
		}
	
	@Test 
	public void testInsertCoins() {
		machine.insertCoin();
		assertEquals(1, machine.getBalance());
	}
	
	@Test
	public void testRefund() {
		assertEquals(0, machine.refund());
	}
	
	@Test
	public void testVendFailure() {
		assertFalse(machine.vendCandyBar());
	}
	
	@Test
	public void testVendSuccess() {
	machine.insertCoin();
	machine.insertCoin();
	machine.insertCoin();
	assertTrue(machine.vendCandyBar());
	}
	
	
}
