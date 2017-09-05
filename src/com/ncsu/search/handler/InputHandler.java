package com.ncsu.search.handler;

import com.ncsu.search.enums.Error;
import com.ncsu.search.enums.SearchType;
import com.ncsu.search.exceptions.CustomException;

public class InputHandler {

    public static void handleInput(String[] args) throws CustomException {
        if (args.length < 3) {
            throw new CustomException(Error.WRONG_NO_OF_INPUT.getMessage());
        }

        if (!SearchType.contains(args[0])) {
            throw new CustomException(Error.WRONG_SEARCH_TYPE.getMessage());
        }
    }
}
