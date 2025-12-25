package com.sainath.spring.data.jpa;

import com.sainath.spring.data.jpa.configuration.PersistenceConfig;
import com.sainath.spring.data.jpa.repository.Product;
import com.sainath.spring.data.jpa.repository.ProductRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PersistenceConfig.class);

        // Get your repository bean
        ProductRepository repo = context.getBean(ProductRepository.class);

        // Perform operations
        repo.save(new Product("Phone", 500.0));
        System.out.println("Total products: " + repo.count());

        context.close();
    }
}