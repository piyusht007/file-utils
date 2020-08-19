package com.piyush.org.third.party.lib.xml;

import com.piyush.org.third.party.lib.Parser;
import com.piyush.org.third.party.lib.model.Wrapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.util.List;

/**
 * Parser implementation to parse xml content.
 */
public class XMLParser implements Parser {
    /**
     * {@inheritDoc}
     * @return
     */
    @Override
    public <T> List<T> parse(final String filename, final Class<T> clazz) {
        final File file = new File(filename);

        try {
            final JAXBContext jaxbContext = JAXBContext.newInstance(Wrapper.class, clazz);
            final Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            final StreamSource xml = new StreamSource(file);
            Wrapper<T> wrapper = jaxbUnmarshaller.unmarshal(xml,
                    Wrapper.class).getValue();

            return wrapper.getItems();
        } catch (final JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }
}
