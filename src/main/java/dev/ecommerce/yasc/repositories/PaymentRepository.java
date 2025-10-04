package dev.ecommerce.yasc.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dev.ecommerce.yasc.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}