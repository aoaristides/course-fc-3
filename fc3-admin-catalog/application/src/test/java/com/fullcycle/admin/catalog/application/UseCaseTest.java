package com.fullcycle.admin.catalog.application;

import com.fullcycle.admin.catalog.domain.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UseCaseTest {

    @Test
    public void testCreateUseCase() {
        Assertions.assertNotNull(new Category());
        Assertions.assertNotNull(new UseCase().execute());
    }

}
