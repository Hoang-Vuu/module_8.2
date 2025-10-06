import java.util.HashMap;
import java.util.Map;

public class task2 {

    private final Map<String, Double> items;

    public task2() {
        this.items = new HashMap<>();
    }

    // Thêm sản phẩm vào giỏ
    public void addItem(String name, double price) {
        items.put(name, price);
    }

    // Xóa sản phẩm khỏi giỏ
    public void removeItem(String name) {
        items.remove(name);
    }

    // Lấy số lượng sản phẩm trong giỏ
    public int getItemCount() {
        return items.size();
    }

    // Tính tổng giá trị sản phẩm trong giỏ
    public double calculateTotal() {
        double total = 0.0;
        for (double price : items.values()) {
            total += price;
        }
        return total;
    }
}
