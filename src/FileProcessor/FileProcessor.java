package FileProcessor;

import java.util.ArrayList;
import java.util.Arrays;

public interface FileProcessor {
    /**
     * Reads Data from a file and returns the extracted data as array
     * @param filePath the absolute file path of which to read
     * @return An Array with the values of the
     */
    default ArrayList read(String filePath){return null;}
    default ArrayList write(String filePath){return null;}
}
