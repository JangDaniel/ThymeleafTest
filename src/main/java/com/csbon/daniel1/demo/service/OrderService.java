package com.csbon.daniel1.demo.service;

import com.csbon.daniel1.demo.model.Order;
import com.csbon.daniel1.demo.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;



    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(final Integer id) {
        return orderRepository.findById(id);
    }

    public List<Order> findByCustomerId(final Integer customerId) {
        return orderRepository.findByCustomerId(customerId);
    }
}
