package com.example.LeHuynhDucBuoi5.demo.repository;

import com.example.LeHuynhDucBuoi5.demo.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
