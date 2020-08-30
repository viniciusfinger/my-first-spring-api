package com.viniciusfinger.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viniciusfinger.course.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> { }
