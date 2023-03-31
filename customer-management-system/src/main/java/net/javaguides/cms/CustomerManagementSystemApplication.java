package net.javaguides.cms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.cms.entity.Customer;
import net.javaguides.cms.repository.CustomerRepository;

@SpringBootApplication
public class CustomerManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CustomerManagementSystemApplication.class, args);
	}
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Customer customer1 = new Customer("Ramesh", "Fadatare", "ramesh@gmail.com");
//		customerRepository.save(customer1);
//		
//		Customer customer2 = new Customer("Sanjay", "Jadhav", "sanjay@gmail.com");
//		customerRepository.save(customer2);
//		
//		Customer customer3 = new Customer("Tony", "Stark", "tony@gmail.com");
//		customerRepository.save(customer3);
		
	}
	
}
