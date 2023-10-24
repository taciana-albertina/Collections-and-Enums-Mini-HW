package com.mycompany.peopleteams;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class csvProcess {
    public List getList(String path) throws FileNotFoundException { 
        
        
        String[] text = null; // Declaration of a string array named 'text' and initializes it as null.
        List<person> persons = new ArrayList<person>(); // Creates an empty list named 'persons' to hold 'person' objects.
        try { // strat of the 'try' block to handle exceptions.
            CSVReader file = new CSVReader(new FileReader(new File(path))); // Creates a CSV reader from a file with the specified path.
            while ((text = file.readNext()) != null && text.length >= 4) {  // While there are lines to read in the CSV file and the length of the line is greater than or equal to 4, do the following:              
               person personAdd = new person(text[1], text[2], text[3]);
               persons.add(personAdd); // Creates a 'person' object with data from the CSV columns and names it 'personAdd'.
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return persons;
    }
}
