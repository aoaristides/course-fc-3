package com.fullcycle.admin.catalog.domain.category;

import com.fullcycle.admin.catalog.domain.pagination.Pagination;

import java.util.Optional;

/**
 * @author aaristides
 */
public interface CategoryGateway {

    Category create(Category aCategory);

    void deleteById(CategoryID anId);

    Optional<Category> findById(CategoryID anId);

    Category update(Category aCategory);

    Pagination<Category> findAll(CategorySearchQuery aQuery);

}
