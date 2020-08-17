package com.piyush.org;

/**
 * Parser to implement reading logic.
 */
public interface Parser {
    /**
     * To read the file contents.
     *
     * @param file - The path of the file to be read
     * @param <T> - Object type
     * @return - The serialized object
     */
    <T> T parse(final String file, final Class<T> clazz);
}
