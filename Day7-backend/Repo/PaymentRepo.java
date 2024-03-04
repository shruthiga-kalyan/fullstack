package com.example.backend.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.Entity.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment,Integer>{

}
