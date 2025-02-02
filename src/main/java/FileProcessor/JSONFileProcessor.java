package FileProcessor;

import java.io.IOException;
import java.util.Map;


public class JSONFileProcessor implements FileProcessor{

    /**
     * Reads Data from a .json file and returns the extracted data as array
     *
     * @param filePath the absolute .json file path of which to read
     * @return An Array with the values of the
     */
    @Override
    public Map<String, Object> read(String filePath) throws IOException, InvalidFileContent {
        String RawData = FileHandler.filePathToString(filePath);

        /***ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(rawData, new TypeReference<Map<String, Object>>() {});
        } catch (IOException e) {
            throw new InvalidFileContent("Invalid JSON content in file: " + filePath);
        }***/
        return null;
    }

    /**
     * Writes data from an Array to a specified path in the Format of the implemented FileProcessor. EXISTING DATA WILL BE OVERWRITTEN
     * @param filePath where the data should be written to. EXISTING DATA WILL BE OVERWRITTEN
     * @param data What is contained in the data
     */
    @Override
    public void write(String filePath, Map<String, Object> data) throws IOException {
        String jsonString = objectMapper.writeValueAsString(data);
        FileHandler.writeDataToFilePath(filePath, jsonString);
    }



}
