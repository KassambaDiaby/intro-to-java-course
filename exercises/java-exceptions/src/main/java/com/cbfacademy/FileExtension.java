package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {

    private String filename;

    // constructor
    public FileExtension(String filename) {
        this.filename = filename;
    }

    // throws is informing/ declaring that this method could throw an exception
    // called filename
    public boolean check(String filename) throws FilenameException {

        // if filename is true or empty, throw exception with this message.

        if (filename == null || filename.isEmpty()) {
            // Throw FilenameException with a descriptive message
            throw new FilenameException("Filename cannot be null or empty");
        }

        // Check if the filename has a ".java" extension, // check method takes in a
        // string "filename", calls to lower case to make the
        // string caseinsensitive, and endswith method to check if it ends with .java
        return filename.toLowerCase().endsWith(".java");
    }

    // map method that takes in a list of file names and retruns a map of string/int
    Map<String, Integer> map(List<String> filenames) {
        // create a new hashmap to store your result
        Map<String, Integer> result = new HashMap<>();
        // go through every filename in the list and run the check method on the
        // filename
        for (String filename : filenames) {

            try {
                // check if the file name is not null,empty or has .java and store the result in
                // a boolean variable
                boolean isJavaFile = check(filename);
                int mappedResult = mapResult(isJavaFile);
                // add the pairs to my empty map, add file name and integer/ converted true or
                // false output
                result.put(filename, mappedResult);

            } catch (FilenameException e) {
                // if you run into the exception, insert -1 to the file name pair
                result.put(filename, -1);
            }
        }
        return result;
    }

    // the mapresult method converts true or false into integer 1 or 0
    private int mapResult(boolean isJavaFile) {
        // if true retrun 1 else false return 0
        if (isJavaFile) {
            return 1;
        } else
            return 0;
    };
}
