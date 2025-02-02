package FileProcessor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileHandler {
    /**
     * Reads the file from the specified path and returns its content as string
     * @param path the absoulte path to the file to be read
     * @return The file content as string
     */
    public static String filePathToString(String path) throws IOException{
        return Files.readString(Path.of(path));
    }

    /**
     * Writes a string to a file. DELETES PREVIOUS FILE CONTENTS
     * @param path absolute path of the output file
     * @param data the string which should be written to the file
     */
    public static void writeDataToFilePath(String path, String data) throws IOException {
        //If the file does not exist, create it. If the file exists clear it
        Files.writeString(Path.of(path), data, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

    }
}
