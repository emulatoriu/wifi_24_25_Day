package logic;

import data.Customer;

public class BankService {
    synchronized public void withDrawMoney(Customer customer, double amount) {
        double customerBalance = customer.getBalance();
        System.out.println("%s, amount to withdraw %f".formatted(customer, amount));
        if (customerBalance < amount) {
            System.out.println("Waiting for more money");
            try {
                Thread.sleep(1000);
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        customer.setBalance(customer.getBalance() - amount);
        System.out.println("Customer %s withdrew %f and has a new balance of %f"
                .formatted(customer, amount, customer.getBalance()));
    }

    synchronized public void depositMoney(Customer customer, double amount) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        double customerBalance = customer.getBalance();
        customer.setBalance(customerBalance + amount);
        System.out.println("Customer %s received %f and has a new balance of %f"
                .formatted(customer, amount, customer.getBalance()));
        notify();
    }

}
