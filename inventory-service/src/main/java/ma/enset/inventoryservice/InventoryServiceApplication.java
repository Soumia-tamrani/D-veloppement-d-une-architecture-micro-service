package ma.enset.inventoryservice;

import ma.enset.inventoryservice.entities.Product;
import ma.enset.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }


@Bean

CommandLineRunner commandLineRunner(ProductRepository productRepository) {
    return args -> {
        productRepository.save(Product.builder()
                .id(UUID.randomUUID().toString())
                .name("Scanner")
                .price(3200)
                .quantity(8)
                .build());
        productRepository.save(Product.builder()
                .id(UUID.randomUUID().toString())
                .name("Computer")
                .price(3800)
                .quantity(2)
                .build());
        productRepository.save(Product.builder()
                .id(UUID.randomUUID().toString())
                .name("Smartphone")
                .price(3250)
                .quantity(4)
                .build());
        productRepository.findAll().forEach(product -> {
            System.out.println(product.toString());


        });
    };
}
}

