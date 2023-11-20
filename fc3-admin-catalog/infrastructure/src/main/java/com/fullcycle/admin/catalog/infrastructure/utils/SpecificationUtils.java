package com.fullcycle.admin.catalog.infrastructure.utils;

import org.springframework.data.jpa.domain.Specification;

/**
 * @author aaristides
 */
public final class SpecificationUtils {

    private SpecificationUtils() {
    }

    public static <T> Specification<T> like(final String prop, final String term) {
        return (root, query, cb) -> cb.like(cb.upper(root.get(prop)), SqlUtils.like(term.toUpperCase()));
    }
}
