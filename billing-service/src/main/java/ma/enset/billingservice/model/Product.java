package ma.enset.billingservice.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Data @Builder
public class Product {

    private String id;
    private String name;
    private double price;
    private int quantity;

}
