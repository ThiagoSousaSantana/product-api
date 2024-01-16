package com.tsantana.product.listener;

public record ProductMessage(
        String category,
        String name,
        Double price) {

}
