package com.fullcycle.admin.catalog.domain.validation;

import java.util.List;

/**
 * @author aaristides
 */
public interface ValidationHandler {

    ValidationHandler append(Error anError);

    ValidationHandler append(ValidationHandler anHandler);

    ValidationHandler validate(Validation anValidation);

    List<Error> getErrors();

    default boolean hasError() {
        return getErrors() != null && !getErrors().isEmpty();
    }

    interface Validation {

        void validate();

    }
}
