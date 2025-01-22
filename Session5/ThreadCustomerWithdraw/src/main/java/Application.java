import data.Customer;
import logic.BankService;

public class Application {
    public static void main(String[] args) {
        Customer customer = new Customer(1000, "Bugs", "Bunny");
        BankService bankService = new BankService();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                bankService.withDrawMoney(customer, 2000);
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                bankService.depositMoney(customer, 1500);
            }
        };

        t1.start();
        t2.start();
    }
}
