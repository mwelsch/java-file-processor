package FileProcessor;

import java.util.ArrayList;
import java.util.Arrays;

public interface FileProcessor {
    /**
     * Reads Data from a file and returns the extracted data as array
     * @param filePath the absolute file path of which to read
     * @return An Array with the values of the File
     */
    public ArrayList<Object> read(String filePath);

    /**
     * Writes data from an Array to a specified path in the Format of the implemented FileProcessor
     * @param filePath where the data should be written to
     * @param data What is contained in the data
     */
    public void write(String filePath, Arrays data);
}
