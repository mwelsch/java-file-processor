package FileProcessor;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class JSONFileProcessor implements FileProcessor{

    /**
     * Reads Data from a file and returns the extracted data as array
     *
     * @param filePath the absolute file path of which to read
     * @return An Array with the values of the
     */
    @Override
    public Map<String, Object> read(String filePath) throws IOException, InvalidFileContent {
        String RawData = FileHandler.filePathToString(filePath);
        
        return null;
    }

    /**
     * Writes data from an Array to a specified path in the Format of the implemented FileProcessor
     *
     * @param filePath where the data should be written to
     * @param data     What is contained in the data
     */
    @Override
    public void write(String filePath, Map<String, Object> data) throws IOException {

    }



}
