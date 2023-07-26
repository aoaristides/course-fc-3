package com.fullcycle.admin.catalog.application.category.delete;

import com.fullcycle.admin.catalog.domain.category.CategoryGateway;
import com.fullcycle.admin.catalog.domain.category.CategoryID;

import java.util.Objects;

/**
 * @author aaristides
 */
public class DefaultDeleteCategoryUseCase extends DeleteCategoryUseCase {

    private final CategoryGateway categoryGateway;

    public DefaultDeleteCategoryUseCase(final CategoryGateway categoryGateway) {
        this.categoryGateway = Objects.requireNonNull(categoryGateway);
    }

    @Override
    public void execute(String anId) {
        this.categoryGateway.deleteById(CategoryID.from(anId));
    }
}
