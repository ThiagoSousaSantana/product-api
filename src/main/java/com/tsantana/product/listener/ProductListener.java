package com.tsantana.product.listener;

import com.tsantana.product.model.Product;
import com.tsantana.product.repository.ProductRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Component
public class ProductListener {

    private final ProductRepository repository;

    public ProductListener(ProductRepository repository) {
        this.repository = repository;
    }

    @RabbitListener(queues = "product")
    public void listen(ProductMessage message) {
        Mono<Product> saved = repository.save(new Product(
                UUID.randomUUID().toString(),
                message.name(),
                message.category(),
                message.price()
        ));

        saved.block();
    }
}
