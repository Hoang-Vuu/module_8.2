import java.util.HashMap;
import java.util.Map;

public class task2 {

    private final Map<String, Double> items;

    public task2() {
        this.items = new HashMap<>();
    }
    public void addItem(String name, double price) {
        items.put(name, price);
    }
    public void removeItem(String name) {
        items.remove(name);
    }
    public int getItemCount() {
        return items.size();
    }
    public double calculateTotal() {
        double total = 0.0;
        for (double price : items.values()) {
            total += price;
        }
        return total;
    }
}
