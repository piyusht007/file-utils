package com.piyush.org.factory;

import com.piyush.org.Parser;
import com.piyush.org.xml.XMLParser;

/**
 * Factory to get {@Parser parser}(s)
 */
public class ParserFactory {
    private ParserFactory() { }

    /**
     * To get the {@Parser} based on the file format
     *
     * @param fileFormat - The format of the file
     * @return Parser
     */
    public static Parser getParser(final String fileFormat) {
        switch (fileFormat) {
            case "xml":
                return new XMLParser();
            default:
                throw new IllegalArgumentException("File format: " + fileFormat + "is not supported");
        }
    }
}
