
import entity.Customer;

public class AppInitializer {
    public static void main(String[] args) {
        Customer customer = new Customer("C001", "John Doe", "123 Main St", 55000.0);

        save(customer);

    }
}