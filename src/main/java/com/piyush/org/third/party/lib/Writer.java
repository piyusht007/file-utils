package com.piyush.org.third.party.lib;

import java.util.List;

/**
 * Writer to write files.
 */
public interface Writer {
    /**
     * To write object of type `t` to a file.
     *
     * @param elements - The elements/records to write
     * @param clazz - The object type
     * @param file - The file path to write to.
     * @param <T>
     */
    <T> void write(final List<T> elements, final Class<T> clazz, final String file, final String root);
}
