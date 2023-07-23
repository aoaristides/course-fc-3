package com.fullcycle.admin.catalog.application.category.update;

/**
 * @author aaristides
 * @param id
 * @param name
 * @param description
 * @param isActive
 */
public record UpdateCategoryCommand(String id, String name, String description, boolean isActive) {

    public static UpdateCategoryCommand with(final String anId, final String aName, final String aDescription, final boolean isActive) {
        return new UpdateCategoryCommand(anId, aName, aDescription, isActive);
    }

}
