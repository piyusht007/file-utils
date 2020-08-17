package com.piyush.org;

/**
 * Writer to write files.
 */
public interface Writer {
    /**
     * To write object of type `t` to a file.
     *
     * @param t - The object to write
     * @param clazz - The object type
     * @param file - The file path to write to.
     * @param <T>
     */
    <T> void write(final T t, final Class<T> clazz, final String file);
}
