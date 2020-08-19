package com.piyush.org.third.party.lib;

import com.piyush.org.third.party.lib.model.Wrapper;

import java.util.List;

/**
 * Parser to implement reading logic.
 */
public interface Parser {
    /**
     * To read the file contents.
     *
     * @param <T> - Object type
     * @param file - The path of the file to be read
     * @return - The serialized object
     */
    <T> List<T> parse(final String file, final Class<T> clazz);
}
