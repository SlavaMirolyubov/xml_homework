package com.mirolyubov.parsers;

import com.mirolyubov.entity.CategoryType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    public List<CategoryType> JAXBParseToJavaObject(String fileName) {

        List<CategoryType> items = new ArrayList<>();

        try {
            XMLStreamReader xmlr = XMLInputFactory
                    .newInstance()
                    .createXMLStreamReader(fileName, new FileInputStream(fileName));

            while (xmlr.hasNext()) {

                xmlr.next();

                if (xmlr.isStartElement() && xmlr.getLocalName().equals("category")) {
                    JAXBContext jc = JAXBContext.newInstance(CategoryType.class);
                    Unmarshaller unmarshaller = jc.createUnmarshaller();
                    JAXBElement<CategoryType> jb = unmarshaller.unmarshal(xmlr, CategoryType.class);
                    CategoryType category = jb.getValue();
                    items.add(category);
                }
            }
        } catch (XMLStreamException | IOException | JAXBException ex) {
            ex.printStackTrace();
        }

        return items;
    }
}
