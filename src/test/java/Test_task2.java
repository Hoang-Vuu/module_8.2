import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test_task2{

    @Test
    public void testAddItem() {
        task2 cart = new task2();

        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);

        assertEquals(2, cart.getItemCount());
    }

    @Test
    public void testRemoveItem() {
        task2 cart = new task2();

        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.removeItem("Apple");

        assertEquals(1, cart.getItemCount());
    }

    @Test
    public void testCalculateTotal() {
        task2 cart = new task2();

        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.addItem("Orange", 0.75);

        assertEquals(2.25, cart.calculateTotal(), 0.01);
    }

    @Test
    public void testRemoveItemThatDoesNotExist() {
        task2 cart = new task2();

        cart.addItem("Apple", 1.0);
        cart.removeItem("Banana"); // không tồn tại

        assertEquals(1, cart.getItemCount());
    }

    @Test
    public void testEmptyCartTotal() {
        task2 cart = new task2();
        assertEquals(0.0, cart.calculateTotal(), 0.001);
    }
}
