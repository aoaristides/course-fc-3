package com.fullcycle.admin.catalog.domain.pagination;

import java.util.List;

/**
 * @author aaristides
 */
public record Pagination<T>(int currentPage, int perPage, long total, List<T> items) {
}
