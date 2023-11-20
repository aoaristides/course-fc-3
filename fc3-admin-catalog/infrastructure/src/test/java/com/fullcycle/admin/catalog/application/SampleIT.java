package com.fullcycle.admin.catalog.application;

import com.fullcycle.admin.catalog.IntegrationTest;
import com.fullcycle.admin.catalog.application.category.create.CreateCategoryUseCase;
import com.fullcycle.admin.catalog.infrastructure.category.persistence.CategoryRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author aaristides
 */
@IntegrationTest
public class SampleIT {

    @Autowired
    private CreateCategoryUseCase useCase;

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void test() {
        Assertions.assertNotNull(useCase);
        Assertions.assertNotNull(categoryRepository);
    }

}
