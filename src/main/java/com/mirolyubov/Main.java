package com.mirolyubov;

import com.mirolyubov.demo.Demo;

public class Main {

    public static void main(String[] args) {

        final String fileName = "src/main/java/com/mirolyubov/product.xml";
        final String schemeFileName = "src/main/java/com/mirolyubov/product.xsd";

        new Demo().execute(fileName, schemeFileName);

    }

}
