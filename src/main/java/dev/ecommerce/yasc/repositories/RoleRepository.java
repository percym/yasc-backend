package dev.ecommerce.yasc.repositories;

import dev.ecommerce.yasc.model.AppRole;
import dev.ecommerce.yasc.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
