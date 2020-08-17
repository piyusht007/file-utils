package com.piyush.org.xml;

import com.piyush.org.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Writer implementation to write xml files.
 */
public class XMLWriter implements Writer {
    /**
     * {@inheritDoc}
     */
    @Override
    public <T> void write(final T t, final Class<T> clazz, final String filename) {
        final File file = new File(filename);

        try {
            final JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            final Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(t, file);
            jaxbMarshaller.marshal(t, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
