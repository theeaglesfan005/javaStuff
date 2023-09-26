package Bank;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        Customer tempCustomer = findCustomer(customerName);
        if(tempCustomer == null) {
            tempCustomer = new Customer(customerName, initialTransaction);
            customers.add(tempCustomer);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String customerName, double transactionAmount) {
        Customer tempCustomer = findCustomer(customerName);
        if(tempCustomer != null) {
            tempCustomer.addTransaction(transactionAmount);
            return true;
        } else {
            return false;
        }
    }

    private Customer findCustomer(String customerName) {
        for(int i=0; i < customers.size(); i++) {
            if(customers.get(i).getName().equals(customerName)){
                return customers.get(i);
            }
        }

        return null;
    }
}