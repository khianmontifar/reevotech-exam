package com.reevo.exam.controller;

import com.reevo.exam.dto.OrderRequestDTO;
import com.reevo.exam.dto.OrderResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService service;

    @PostMapping("/create")
    public Mono<PurchaseOrder> createOrder(@RequestBody Mono<OrderRequestDTO> mono){
        return mono
                .flatMap(this.service::createOrder);
    }

    @GetMapping("/all")
    public Flux<OrderResponseDTO> getOrders(){
        return this.service.getAll();
    }
}
