package DependencyInjectionExample;

public class Main {
    public static void main(String[] args) {
        // Create an instance of CustomerRepositoryImpl
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        
        // Inject CustomerRepositoryImpl into CustomerService
        CustomerService customerService = new CustomerService(customerRepository);
        
        // Use CustomerService to find a customer
        String customerInfo = customerService.getCustomerInfo(1);
        
        // Print customer information
        System.out.println(customerInfo);
    }
}

// Output:
// Customer with ID: 1

