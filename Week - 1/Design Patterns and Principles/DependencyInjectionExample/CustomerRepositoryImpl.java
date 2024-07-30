package DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // For demonstration purposes, return a dummy customer
        return "Customer with ID: " + id;
    }
}

