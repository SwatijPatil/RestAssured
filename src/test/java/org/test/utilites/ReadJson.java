package org.test.utilites;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadJson {
    public static String readJsonFile(String filepath) throws FileNotFoundException {
        File f=new File(filepath);
        FileReader fr=new FileReader(f);
        JSONTokener jt=new JSONTokener(fr);
        JSONObject j=new JSONObject(jt);
        return j.toString();


    }
}
