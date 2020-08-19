package com.piyush.org.third.party.lib.xml;

import com.piyush.org.third.party.lib.Writer;
import com.piyush.org.third.party.lib.model.Wrapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.File;
import java.util.List;

/**
 * Writer implementation to write xml files.
 */
public class XMLWriter implements Writer {
    /**
     * {@inheritDoc}
     */
    @Override
    public <T> void write(final List<T> elements, final Class<T> clazz, final String filename, final String root) {
        final File file = new File(filename);

        try {
            final JAXBContext jaxbContext = JAXBContext.newInstance(Wrapper.class, clazz);
            final Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            final QName qName = new QName(root);
            final Wrapper wrapper = new Wrapper(elements);
            final JAXBElement<Wrapper> jaxbElement = new JAXBElement<>(qName,
                    Wrapper.class, wrapper);

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(jaxbElement, file);
            jaxbMarshaller.marshal(jaxbElement, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
