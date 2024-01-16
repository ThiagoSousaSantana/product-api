package com.tsantana.product.model;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;

@Container(containerName = "product")
public record Product(

        @Id
        String id,

        @PartitionKey
        String category,
        String name,
        Double price
) {
}
