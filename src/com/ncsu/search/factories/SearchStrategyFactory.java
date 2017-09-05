package com.ncsu.search.factories;

import com.ncsu.search.enums.SearchType;
import com.ncsu.search.handler.BFSHandler;
import com.ncsu.search.handler.DFSHandler;
import com.ncsu.search.handler.SearchHandler;

public class SearchStrategyFactory {

    public static SearchHandler getHandlerFor(SearchType searchType) {
        if (searchType.name().equalsIgnoreCase(SearchType.BFS.name())) {
            return new BFSHandler();
        } else if (searchType.name().equalsIgnoreCase(SearchType.DFS.name())) {
            return new DFSHandler();
        } else {
            return null;
        }
    }
}
