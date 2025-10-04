package dev.ecommerce.yasc.repositories;

import dev.ecommerce.yasc.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByCategoryName(String categoryName);
}
