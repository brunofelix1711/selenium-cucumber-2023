package com.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class CommonUtilities {

    FileReader reader;

    public void load_properties() throws IOException {

        try {

            reader = new FileReader("config.properties");

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

        Properties properties = new Properties();
        try {
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();

        }
        properties.getProperty("APP_URL");
        properties.getProperty("BROWSER");
        properties.getProperty("UserName");
        properties.getProperty("Password");
    }
}
