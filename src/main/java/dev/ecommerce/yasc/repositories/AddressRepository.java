package dev.ecommerce.yasc.repositories;

import dev.ecommerce.yasc.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
