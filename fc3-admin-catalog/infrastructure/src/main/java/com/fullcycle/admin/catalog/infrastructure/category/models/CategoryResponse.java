package com.fullcycle.admin.catalog.infrastructure.category.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

/**
 * @author aaristides
 * @param id
 * @param name
 * @param description
 * @param active
 * @param createdAt
 * @param updatedAt
 * @param deletedAt
 */
public record CategoryResponse(
        @JsonProperty("id") String id,
        @JsonProperty("name") String name,
        @JsonProperty("description") String description,
        @JsonProperty("is_active") Boolean active,
        @JsonProperty("created_at") Instant createdAt,
        @JsonProperty("updated_at") Instant updatedAt,
        @JsonProperty("deleted_at") Instant deletedAt
) {
}
