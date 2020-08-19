package com.piyush.org.third.party.lib.factory;

import com.piyush.org.third.party.lib.Writer;
import com.piyush.org.third.party.lib.xml.XMLWriter;

/**
 * Factory to get {@Writer writer}(s)
 */
public class WriterFactory {
    private WriterFactory() { }

    /**
     * To get the {@Writer} based on the file format
     *
     * @param fileFormat - The formal of the file
     * @return Writer
     */
    public static Writer getWriter(final String fileFormat){
        switch (fileFormat) {
            case "xml":
                return new XMLWriter();
            default:
                throw new IllegalArgumentException("File format: " + fileFormat + "is not supported");
        }
    }
}
