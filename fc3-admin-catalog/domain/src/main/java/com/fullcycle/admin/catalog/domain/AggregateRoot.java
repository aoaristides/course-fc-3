package com.fullcycle.admin.catalog.domain;

/**
 * @author aaristides
 * @param <ID>
 */
public class AggregateRoot<ID extends Identifier> extends Entity<ID> {

    protected AggregateRoot(final ID id) {
        super(id);
    }

}
