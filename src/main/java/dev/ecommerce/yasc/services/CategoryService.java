package dev.ecommerce.yasc.services;

import dev.ecommerce.yasc.model.Category;
import dev.ecommerce.yasc.payload.CategoryDTO;
import dev.ecommerce.yasc.payload.CategoryResponse;

public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
