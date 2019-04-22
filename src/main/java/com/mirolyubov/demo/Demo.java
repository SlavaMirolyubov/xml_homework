package com.mirolyubov.demo;

import com.mirolyubov.entity.CategoryType;
import com.mirolyubov.parsers.Converter;
import com.mirolyubov.parsers.Parser;
import com.mirolyubov.parsers.XMLValidator;

import java.io.IOException;
import java.util.List;

public class Demo {

    public void execute(String xmlFileName, String schemaFileName) {

        System.out.println("Валидация");

        XMLValidator xmlValidator = new XMLValidator();

        if (xmlValidator.validateXML(xmlFileName, schemaFileName)) {

            Parser parser = new Parser();
            Converter converter = new Converter();
            List<CategoryType> items;

            System.out.println("StAX + JAXB");
            items = parser.JAXBParseToJavaObject(xmlFileName);
            System.out.println(items);

            System.out.println("Из XML to Json");
            try {
                converter.convertJavaObjectToJsonFile(items);
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Json to Objects");
            try {
                System.out.println(converter.convertJsonFileToJavaObject());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("XML не прошел валидацию");
        }
    }

}
