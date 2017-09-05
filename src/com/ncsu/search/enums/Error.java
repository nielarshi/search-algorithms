package com.ncsu.search.enums;

public enum Error {
    WRONG_NO_OF_INPUT("Input is not as expected, make sure to pass 3 arguments in order of searchtype srccityname destcityname."),
    WRONG_SEARCH_TYPE("Search can only be either DFS or BFS");

    private String message;
    Error(String errorMessage) {
        this.message = errorMessage;
    }

    public String getMessage() {
        return message;
    }
}
