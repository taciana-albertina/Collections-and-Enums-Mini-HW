package com.mycompany.peopleteams;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class csvProcess {
    public List getList(String path) throws FileNotFoundException {
        
        
        String[] text = null;
        List<person> persons = new ArrayList<person>();
        try {
            CSVReader file = new CSVReader(new FileReader(new File(path)));
            while ((text = file.readNext()) != null && text.length >= 4) {                
               person personAdd = new person(text[1], text[2], text[3]);
               persons.add(personAdd);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return persons;
    }
}
