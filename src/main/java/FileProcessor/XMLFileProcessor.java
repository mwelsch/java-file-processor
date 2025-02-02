package FileProcessor;

import java.io.IOException;
import java.util.Map;

public class XMLFileProcessor implements FileProcessor{

    /**
     * Reads Data from a file and returns the extracted data as array
     *
     * @param filePath the absolute file path of which to read
     * @return Map with the keys paired to the values
     */
    @Override
    public Map<String, Object> read(String filePath) throws IOException, InvalidFileContent {
        return Map.of();
    }

    /**
     * Writes data from an Array to a specified path in the Format of the implemented FileProcessor. EXISTING DATA WILL BE OVERWRITTEN
     *
     * @param filePath where the data should be written to. EXISTING DATA WILL BE OVERWRITTEN
     * @param data     What is contained in the data
     */
    @Override
    public void write(String filePath, Map<String, Object> data) throws IOException {

    }
}