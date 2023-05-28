package org.test.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

    public static Properties readPropertiesFileData(String filepath) throws IOException {
        File f=new File(filepath);
        FileInputStream fis=new FileInputStream(f);
        Properties prop=new Properties();
        prop.load(fis);
        System.out.println(prop.getProperty("POST_URI"));
        //return prop;
        return prop;
    }
}
