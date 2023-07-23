package com.fullcycle.admin.catalog.domain.exceptions;

import com.fullcycle.admin.catalog.domain.validation.Error;

import java.util.List;

/**
 * @author aaristides
 */
public class DomainException extends RuntimeException {

    private final List<Error> errors;

    private DomainException(final List<Error> anErrors) {
        super("", null, true, false);
        this.errors = anErrors;
    }

    public static DomainException with(final List<Error> anErrors) {
        return new DomainException(anErrors);
    }

    public List<Error> getErrors() {
        return errors;
    }
}