package com.piyush.org.xml;

import com.piyush.org.Parser;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Parser implementation to parse xml content.
 */
public class XMLParser implements Parser {
    @Override
    public <T> T parse(final String filename, final Class<T> clazz) {
        final File file = new File(filename);

        try {
            final JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            final Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            return clazz.cast(jaxbUnmarshaller.unmarshal(file));
        } catch (final JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }
}
