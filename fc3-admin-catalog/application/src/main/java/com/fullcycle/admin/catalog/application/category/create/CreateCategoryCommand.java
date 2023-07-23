package com.fullcycle.admin.catalog.application.category.create;

/**
 * @author aaristides
 * @param name
 * @param description
 * @param isActive
 */
public record CreateCategoryCommand(String name, String description, boolean isActive) {

    public static CreateCategoryCommand with(final String aName, final String aDescription, final boolean isActive) {
        return new CreateCategoryCommand(aName, aDescription, isActive);
    }

}
