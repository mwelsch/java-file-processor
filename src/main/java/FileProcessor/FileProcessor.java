package FileProcessor;

import java.io.IOException;
import java.util.Map;

public interface FileProcessor {
    /**
     * Reads Data from a file and returns the extracted data as array
     * @param filePath the absolute file path of which to read
     * @return Map with the keys paired to the values
     */
    public Map<String, Object> read(String filePath) throws IOException, InvalidFileContent;

    /**
     * Writes data from an Array to a specified path in the Format of the implemented FileProcessor. EXISTING DATA WILL BE OVERWRITTEN
     * @param filePath where the data should be written to. EXISTING DATA WILL BE OVERWRITTEN
     * @param data What is contained in the data
     */
    public void write(String filePath, Map<String, Object> data) throws IOException;
}
