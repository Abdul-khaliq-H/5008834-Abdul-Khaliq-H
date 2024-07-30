package DependencyInjectionExample;

public class CustomerService {
    private final CustomerRepository customerRepository;

    // Constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String getCustomerInfo(int id) {
        return customerRepository.findCustomerById(id);
    }
}
