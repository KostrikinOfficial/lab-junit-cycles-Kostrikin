import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VendingMachineTest {

    private VendingMachine vendingMachine;

    @BeforeEach
    void setUp() {
        vendingMachine = new VendingMachine(5, 3);
        System.out.println("Автомат создан: кола=" + vendingMachine.getColaCount() + ", чипсы=" + vendingMachine.getChipsCount());
    }

    @Test
    void testInitialColaCount() {
        assertEquals(5, vendingMachine.getColaCount());
    }

    @Test
    void testInitialChipsCount() {
        assertEquals(3, vendingMachine.getChipsCount());
    }

    @Test
    void testSuccessfulColaPurchase() {
        boolean result = vendingMachine.buyCola(2.0);
        System.out.println("После покупки: кола=" + vendingMachine.getColaCount() + ", деньги=" + vendingMachine.getMoneyCollected());
        assertTrue(result);
        assertEquals(4, vendingMachine.getColaCount());
        assertEquals(2.0, vendingMachine.getMoneyCollected());
    }

    @Test
    void testChipsPurchaseInsufficientMoney() {
        boolean result = vendingMachine.buyChips(1.0);
        assertFalse(result);
        assertEquals(3, vendingMachine.getChipsCount());
        assertEquals(0.0, vendingMachine.getMoneyCollected());
    }
}