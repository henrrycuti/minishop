package com.tecsup.minishop.controller;

public record CreateProductRequest(String name, Double price, Integer stock) {
}
