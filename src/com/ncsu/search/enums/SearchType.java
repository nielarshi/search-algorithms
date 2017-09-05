package com.ncsu.search.enums;

public enum SearchType {
    BFS, DFS;

    public static boolean contains(String type) {
        for (SearchType searchType : SearchType.values()) {
            if (searchType.name().equalsIgnoreCase(type)) {
                return true;
            }
        }
        return false;
    }
}
