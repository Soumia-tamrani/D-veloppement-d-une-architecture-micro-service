package ma.enset.customerservice;

import ma.enset.customerservice.entities.Customer;
import ma.enset.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder()
                            .name("Soumia").email("tamraniosoumia01@gmail.com")
                            .build());
            customerRepository.save(Customer.builder()
                    .name("tamrani").email("tamraniosoumia02@gmail.com")
                    .build());
            customerRepository.save(Customer.builder()
                    .name("khadija").email("tamranikhadija02@gmail.com")
                    .build());
            customerRepository.findAll().forEach(customer -> {
                System.out.println("-----------------------------------------");
                System.out.println(customer.getId());
                System.out.println(customer.getName());
                System.out.println(customer.getEmail());
                System.out.println("------------------------------------------");
            });

        };

    }

}
