package PP135;

import java.util.Random;

public class BankSimulation {

    private static final int MAX_NUM_CUSTOMERS = 5;
    private static final int MAX_CUST_SERVICED = 4;
    private static final int CYCLES = 10;
    
    
    public static void main(String[] args) {
        int numCustomers, custServiced, tellerTime;
        
        Customer person;
        
        Random generator = new Random();
        int custCounter = 0;
        Line line = new Line();
        
        for (int i =0; i < CYCLES; i++){
            numCustomers = generator.nextInt(MAX_NUM_CUSTOMERS);
            // Customers arrving at the bank
            for (int j = 0; j< numCustomers; j++){
                person = new Customer(custCounter++);
                line.addCustomer(person);
                System.out.println(person + " joinds the line.");
            }
            custServiced = generator.nextInt(MAX_CUST_SERVICED);
            // Tellers service customers
            
            for(int j = 0; j<custServiced; j++){
                if (line.isEmpty())
                    System.out.println("Teller is Waiting");
                else
                    System.out.println(line.nextCustomer() + " is being serviced");
            }
        }
        System.out.println("Bank closing ......");
        while (!line.isEmpty())
            System.out.println(line.nextCustomer() + " is being serviced");
    }

}
