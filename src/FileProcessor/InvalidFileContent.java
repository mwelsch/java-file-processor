package FileProcessor;

public class InvalidFileContent extends RuntimeException {
    public InvalidFileContent(String message) {
        super(message);
    }
}
